public class EqualMatrix    
{    
    public static void main(String[] args) {    
        int row1, col1, row2, col2;    
        boolean flag = true;    
            
        //Initialize matrix a    
        int a[][] = {       
                        {2, 2, 3},    
                        {8, 4, 6},    
                        {4, 5, 7}    
                    };    
              
          //Initialize matrix b    
        int b[][] = {       
                        {1, 2, 3},    
                        {8, 5, 6},    
                        {9, 5, 7}    
            };    
              
        //Calculates the number of rows and columns present in the first matrix    
    
          row1 = a.length;    
        col1 = a[0].length;    
            
        //Calculates the number of rows and columns present in the second matrix    
    
          row2 = b.length;    
        col2 = b[0].length;    
            
        //Checks if dimensions of both the matrices are equal    
        if(row1 != row2 || col1 != col2){    
            System.out.println("Matrices are not equal");    
        }    
        else {    
            for(int i = 0; i < row1; i++){    
                for(int j = 0; j < col1; j++){    
                  if(a[i][j] != b[i][j]){    
                      flag = false;    
                      a[i][j]=0;
                      b[i][j]=0;    
                  }    
                }    
            }    
                
            if(flag)    
                System.out.println("Matrices are equal");    
            else{
            	System.out.println("Matrices are not equal");
            	
            	for(int i=0;i<row1;i++){    
			for(int j=0;j<col1;j++){    
				  
				System.out.print(a[i][j]+" ");    
			}    
			System.out.println();//new line    
		}
		
		System.out.println();
		
		for(int i=0;i<row1;i++){    
			for(int j=0;j<col1;j++){    
				  
				System.out.print(b[i][j]+" ");    
			}    
			System.out.println();//new line    
		}
            	
            }    
                    
        }    
    }    
}