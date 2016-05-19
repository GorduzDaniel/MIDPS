package org.learning.Symphonia.Music;

import java.util.List;
import org.simpleframework.xml.ElementList;

public class SheetSegment {
	@ElementList
	private List<Note> segment;
	
	public List<Note> getSegment() {
		return segment;
	}
}
