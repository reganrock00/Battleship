import java.util.*;

public class BattleshipList
	{
		private String Yes;
		
		private String[][] Board;
		
		private String[][] AtkBoard;
		
		private ArrayList<Board> shipBoard;
		
		private int ships;
		
		private ArrayList<atkBoard> AttackBoard;
		
		public BattleshipList (String Yes)
			{
				Board = new String[10][10];	
				AtkBoard = new String [10][10];
				shipBoard = new ArrayList<Board>();
				placeShip = ships;
				attackBoard = new ArrayList<atkBoard>();	
				
			}
			
			}
		public String getYes()
			{
				return Yes;
			}


		public void setYes(String yes)
			{
				Yes = yes;
			}


		public String[][] getBoard()
			{
				return Board;
			}


		public void setBoard(String[][] board)
			{
				Board = board;
			}


		public String[][] getAtkBoard()
			{
				return AtkBoard;
			}


		public void setAtkBoard(String[][] atkBoard)
			{
				AtkBoard = atkBoard;
			}


		public ArrayList<Board> getShipBoard()
			{
				return shipBoard;
			}


		public void setShipBoard(ArrayList<Board> shipBoard)
			{
				this.shipBoard = shipBoard;
			}


		public int getShips()
			{
				return ships;
			}


		public void setShips(int ships)
			{
				this.ships = ships;
			}


		public ArrayList<atkBoard> getAttackBoard()
			{
				return AttackBoard;
			}


		public void setAttackBoard(ArrayList<atkBoard> attackBoard)
			{
				AttackBoard = attackBoard;
			}


		
		
	
	