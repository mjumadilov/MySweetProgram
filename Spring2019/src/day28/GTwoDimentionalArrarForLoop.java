package day28;

public class GTwoDimentionalArrarForLoop {

	public static void main(String[] args) {

		
		 int[][] table = new int[4][2];
		  table[0][0] = 12;
		  table[0][1] = 17;
		  table[1][0] = 3;
		  table[1][1] = 40;
		  table[2][0] = 44;
		  table[2][1] = 27;
		  table[3][0] = 23;
		  table[3][1] = 12;
		  
		  for(int[] row : table) {
			  for(int cell : row) {
		//		  System.out.print(cell + " ");
			  }
			  
	//		  System.out.println();
		  }
		  for (int i = 0; i < table.length; i++) {
			
			  int[] eachRow = table[i];
			  
			  for (int j = 0; j < eachRow.length; j++) {
				System.out.print(eachRow[j] + " ");
			}
			  
			  System.out.println();
		}
		
	}

}
