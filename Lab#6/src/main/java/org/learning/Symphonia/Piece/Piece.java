package org.learning.Symphonia.Piece;

import org.simpleframework.xml.Element;

public class Piece {
	@Element
	private String name;
	
	@Element
	private String resource;
	
   /**
	*
	* @return name
	*/
	public String getName() {
		return name;
	}
	
   /**
	*
	* @return resource
	*/
	public String getResource() {
		return resource;
	}
}
