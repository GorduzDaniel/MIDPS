package org.learning.Symphonia.Music;

import org.simpleframework.xml.Element;

class Note {
	@Element
	private String name;
	
	@Element
	private long duration;

	public String getNote() {
		return name;
	}
	public double getDuration() {
		return duration;
	}
}
