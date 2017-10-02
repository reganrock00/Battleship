
import java.util.*;

public class Battleship
	{

		public static void main(String Yes)
			{
				System.out.println("Welcome Officers to the Naval Waters!");
				System.out.println();
				System.out.println("Soon you will be directed to our maps, where you will position your ships!");
				System.out.println();
				System.out.println("                Ship Board");
				System.out.println();
				
				ArrayList<String> Board = new ArrayList<String>();
				Board.add("    1   2   3   4   5   6   7   8   9   10");
				Board.add("  -----------------------------------------");
				Board.add("a |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("b |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("c |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("d |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("e |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("f |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("g |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("h |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("i |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				Board.add("j |   |   |   |   |   |   |   |   |   |   |");
				Board.add("  -----------------------------------------");
				
			
				for (int i = 0; i < Board.size(); i++)
					{
						System.out.println(Board.get(i));
					}
				System.out.println();
				
				
				
				System.out.println("                Attack Board");
				System.out.println();
				
				ArrayList<String> atkBoard = new ArrayList<String>();
				atkBoard.add("    1   2   3   4   5   6   7   8   9   10");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("a |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("b |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("c |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("d |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("e |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("f |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("g |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("h |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("i |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				atkBoard.add("j |   |   |   |   |   |   |   |   |   |   |");
				atkBoard.add("  -----------------------------------------");
				
				for (int i = 0; i < atkBoard.size(); i++)
					{
						System.out.println(atkBoard.get(i));
					}
				System.out.println();
				
				System.out.println("To place your ships on your ship board, \nplease enter the x and y values associated"
						+ "with the desired location");
				
				
				
				
			}

	}
