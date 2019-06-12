import static java.lang.System.*;
import java.awt.Color;

public class PieceTester
{
	public static void main(String[] args)
	{
		Piece pieceOne = new Piece();
		System.out.println(pieceOne);
		
		Piece redChecker = new Piece("red checker");
		System.out.println(redChecker);	
		
		Piece theShoe = new Piece(100,100,"the shoe from a money game");
		System.out.println(theShoe);	
		
		Piece bishop = new Piece(200 ,200, 20, 20, "bishop", Color.WHITE);
		System.out.println(bishop);					
	}
}

