package org.learning.Symphonia.Music;

import org.simpleframework.xml.core.Persister;
import org.simpleframework.xml.Serializer;

import java.io.File;

public class SheetMusicController {
	private SheetMusic sheetMusic;
	
	private Sounds sounds;
	
	private SoundPlayer player = new SoundPlayer();

	private SheetMusicThread sheetMusicThread;
	
	public SheetMusic getSheetMusic() {
		return sheetMusic;
	}
	
	public SheetMusic loadPiece(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		sheetMusic = serializer.read(SheetMusic.class, file);
		return sheetMusic;
	}
	
	public Sounds loadSounds(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		sounds = serializer.read(Sounds.class, file);
		return sounds;
	}
	
	private class SheetMusicThread implements Runnable {
		private Thread thread = new Thread(this);
		
		private volatile boolean suspended = false;
		
		public SheetMusicThread() {
			thread.start();
		}
		
		private synchronized void suspend() {
			suspended = true;
		}
		
		public synchronized void resume() {
			suspended = false;
			notify();
		}
		
		@Override
		public void run() {
			try {
				for (SheetSegment segment : sheetMusic.getSegments()) {
					for (Note note : segment.getTrebleClef()) {
						if (note.getNote().equals("PAUSE")) 
							continue;
						player.play(sounds.getSound(note.getNote()));
					}
					for (Note note : segment.getBassClef()) {
						if (note.getNote().equals("PAUSE")) 
							continue;
						player.play(sounds.getSound(note.getNote()));
					}
					synchronized (this) {
						while (suspended)
							wait();
					}
					suspend();
				}
			}
			catch (InterruptedException exception) {
				exception.printStackTrace();
			}
		}
	}
	
	public void append() {
		sheetMusicThread.resume();
	}
	
	public void play() throws Exception {
		sheetMusicThread = new SheetMusicThread();
	}
	
	public SheetMusicController() {
		try {
			loadSounds("src/main/resources/sounds.xml");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
