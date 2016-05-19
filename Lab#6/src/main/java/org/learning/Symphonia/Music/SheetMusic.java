package org.learning.Symphonia.Music;

import java.util.List;

import org.simpleframework.xml.Root;
import org.simpleframework.xml.ElementList;

@Root
public class SheetMusic {
	@ElementList
	private List<SheetSegment> sheetTrebleSegments;
	
	@ElementList
	private List<SheetSegment> sheetBassSegments;
	
	public List<SheetSegment> getTrebleSegments() {
		return sheetTrebleSegments;
	}
	public List<SheetSegment> getBassSegments() {
		return sheetBassSegments;
	}
}
