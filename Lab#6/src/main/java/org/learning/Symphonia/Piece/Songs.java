package org.learning.Symphonia.Piece;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root
public class Songs {
	@ElementList
	private List<Piece> pieces;
	
   /**
	*
	* @return pieces
	*/
	public List<Piece> getPieces() {
		return pieces;
	}
}
