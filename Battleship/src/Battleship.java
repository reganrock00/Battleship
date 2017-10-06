  import java.util.*;
   import java.util.Scanner;
   public class Battleship
   {
	   
	   public static void main(String[] arg)
	      {
	    	  PlayGame();
	      }
private static void PlayGame()
		{
			System.out.println("WELCOME BACK TO THE NAVAL WATERS CAPTAIN...");
			   System.out.println();
			   System.out.println("SIR WE HAVE SPOTTED ENEMY SHIPS IN OUR AREA.");
			   System.out.println("WE HAVE GIVEN YOU CONTROL CAP, THEY ARE BEGGINING TO ATTACK.");
			   System.out.println();
			   String arr[] = {"SOUND", "THE", "ALARMS",};
			   for (String i: arr)
			   {
				   
				   System.out.println("***ALARMS***");
				   try
					{
						Thread.sleep(1000);
					} catch (InterruptedException e)
					{
						e.printStackTrace();
					}
//				   added a time delay to the opening sequence
			   }
			   System.out.println();
			   System.out.println("LAUNCH THE TORPEDOS AT ONCE!");
			   System.out.println();

			   
		         String[][] gameboard = new String[10][10];
		         createBoard(gameboard);
		         createShip(gameboard, 4);
		         int torps = 10;
		         int hits = 0;
		         
		         while(torps > 0 && hits < 4)
		         {
		            showBoard(gameboard);
		            hits = attacks(gameboard, hits, torps);
		            torps --;
		         }
		         finall(hits, torps);
		      }
	      Scanner input = new Scanner(System.in);
			
		
      
      
      public static void createBoard(String[][] gameboard)
      {
    	  
         for(int r = 0; r < gameboard.length; r++)
         {
            for(int c = 0; c < gameboard[0].length; c++)
            {
               gameboard[r][c] = "~";
            }
         }
      }
      
      public static void showBoard(String[][] gameboard)
      {
    	  int counter = 1;
    	  for (int i = 1; i < 11; i++){
    		  System.out.print("   "+i);
    	  }
    	  System.out.println();
         for(int r = 0; r < gameboard.length; r++)
         {
        	 
        	 System.out.println(" -----------------------------------------");
               for(int c = 0; c < gameboard[0].length; c++)
               {
            	   
                  if(gameboard[r][c].equals("S"))
                  {
                     System.out.print(" | "+"~");
                  }
                  else
                  {
                     System.out.print(" | "+gameboard[r][c]);
                  }
               }
               
               System.out.println(" |" + counter);
            counter++;
         }
         System.out.println(" -----------------------------------------");
      }
      
      public static void createShip(String[][] gameboard,int size)
      {
         if(Math.random() < 0.5)
         {
            int col = (int)(Math.random()*5);
            int row = (int)(Math.random()*7);
            for(int i = 0; i<size; i++)
            {
               gameboard[row][col+i] = "S";
            }
         }
         else
         {
            int col = (int)(Math.random()*7);
            int row = (int)(Math.random()*5);
            for(int i = 0; i<size; i++)
            {
               gameboard[row+i][col] = "S";
            }
         }
      }
      public static int attacks(String[][] gameboard, int hits, int torps)
      {
         Scanner input = new Scanner(System.in);
         int row,col;
         System.out.println("You have: "+ torps +" torpedos left!");
         System.out.println();
         System.out.println("Select a row to fire in: ");
         row = input.nextInt();
         String [] rowLet = new String [10]; 
         while(row > 10 || row < 1) 
         {
            System.out.println("Please enter a valid row! (A -> J)");
            String.valueOf(input.nextInt());
            row = input.nextInt();
         }
         System.out.println("Select a column to fire in: ");
         col = input.nextInt();
         while(col > 10 || col < 1) 
         {
            System.out.println("Please enter a valid col! (1 -> 10)");
            col = input.nextInt();
         }
         if(gameboard[row-1][col-1].equals("S"))
         {
            hits ++;
            System.out.println("Sir we have struck an enemy ship!");
            gameboard[row-1][col-1] = "X";
         }
         else
         {
            System.out.println("Sir we did not confirm contact!");
            gameboard[row-1][col-1] = "M";
         }
         return hits;
      }
      
      public static void finall(int hits, int torps)
      {
         if(hits < 4)
        	 {
            System.out.println("Your ship has sunk, the enemy has won the battle, but the war has just begun.");
        	 }
         if(torps < 1)
        	 {
            System.out.println("You have lost all your torpedos");
        	 }
         else
        {
            if(hits >= 4)
            {
               System.out.println("Sir you have successfully taken out all enemy ships!");
            }
        } 
      }
     
   }