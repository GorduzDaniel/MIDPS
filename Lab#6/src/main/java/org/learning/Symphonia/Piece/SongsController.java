package org.learning.Symphonia.Piece;

import java.io.File;

import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

public class SongsController {
	private Songs songs;
	
   /**
	*
	* @param filename
	* @return songs
	*/
	public Songs loadSongs(String filename) throws Exception {
		Serializer serializer = new Persister();
		File file = new File(filename);
		songs = serializer.read(Songs.class, file);
		return songs;
	}
	
   /**
	*
	* @return songs
	*/
	public Songs getSongs() {
		return songs;
	}
}
