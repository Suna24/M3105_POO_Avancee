package lsp;

public class Square {

	// Attribute
	private Rectangle rect;

	// Constructor
	public Square() {
		super();
		rect = new Rectangle();
	}

	// Getters && Setters
	public void setSize(int size) {
		rect.setWidth(size);
		rect.setHeight(size);
	}

	public int getSize() {
		return rect.getWidth();
	}

	public int getArea() {
		return rect.getArea();
	}

}
