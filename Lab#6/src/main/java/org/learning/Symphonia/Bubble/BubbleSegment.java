package org.learning.Symphonia.Bubble;

import java.util.ArrayList;
import java.util.List;

public class BubbleSegment {
	private List<Bubble> bubbles = new ArrayList<Bubble>();
	
	public void add(int position, double duration) {
		bubbles.add(new Bubble(position, duration));
	}
}
