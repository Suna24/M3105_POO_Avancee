package lsp;

public class LspTest {

	public static void main (String args[])
	{
		Rectangle aRectangle = new Rectangle();

		aRectangle.setWidth(5);
		aRectangle.setHeight(10);
		
		System.out.println(aRectangle.getArea());
		
		
		Square square = new Square();
		
		square.setSize(3);
		
		System.out.println(square.getArea());
	}
}
