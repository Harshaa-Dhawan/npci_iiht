public class MatrixAddition{  
    public static void main(String args[]){  
    //creating two matrices    
    int a[][]={{1,2,2},{3,-2,5}};    
    int b[][]={{4,3,0},{7,5,1}};    
        
    //creating another matrix to store the sum of two matrices    
    int c[][]=new int[2][3];  
        
    
    for(int i=0;i<2;i++){    
    for(int j=0;j<3;j++){    
    c[i][j]=a[i][j]+b[i][j];    
    System.out.print(c[i][j]+" ");    
    }    
    System.out.println();
    }    
    }}