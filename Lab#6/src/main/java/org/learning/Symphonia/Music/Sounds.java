package org.learning.Symphonia.Music;

import java.util.Map;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.ElementMap;

@Root
public class Sounds {
	@ElementMap
	private Map<String, String> sounds;
	
	public String getSound(String note) {
		return sounds.get(note);
	}
}
