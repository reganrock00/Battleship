

public class BSL
	{
		private String[][] createBoard;
		
		private String[][] showBoard;
		
		
		public BSL (String[][] createBoard, String[][] showBoard)
			{
				this.createBoard = createBoard;
				this.showBoard = showBoard;				
			}

		public String[][] getCreateBoard() 
			{
			return createBoard;
			}

		public void setCreateBoard(String[][] createBoard)
			{
			this.createBoard = createBoard;
			}

		public String[][] getShowBoard() 
			{
			return showBoard;
			}

		public void setShowBoard(String[][] showBoard) 
			{
			this.showBoard = showBoard;
			}
}