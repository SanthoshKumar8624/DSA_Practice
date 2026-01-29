package Matrix_2dArray;
import java.util.Arrays;
public class SetMatrixZeroes {
    public static void bfSolution(int [][] a)//bruteForce using another matrix t=O(m*n) s=O(m*n)
    {
        int rows=a.length;
        int cols=a[0].length;
        int [] []copy=new int [rows][cols];
        for(int r=0;r<rows;r++) {//copying the matrix to another new matrix
            for(int c=0;c<cols;c++) {
                copy[r][c]=a[r][c];}
        }
        for(int r=0;r<rows;r++) {
            for (int c = 0; c < cols; c++) {
                if (a[r][c] == 0) {
                    for (int rc = 0; rc < cols; rc++) {
                        copy[r][rc] =0;//this make row element as zeros
                    }
                    for (int rr = 0; rr < rows; rr++) {
                        copy[rr][c] =0;//this make column element as zeros
                    }
                }
            }
        }
        for(int r=0;r<rows;r++) {
            for(int c=0;c<cols;c++) {
                a[r][c]=copy[r][c];//pasting element back to the original matrix
            }
        }
    }
    public static void optimalInPlaceSolution(int [][] a)
    {
        int row=a.length;
        int col=a[0].length;
        boolean firstRowZeroFlag=false;
        boolean firstColZeroFlag=false;
        for(int j=0;j<col;j++){
            if(a[0][j]==0){
                firstRowZeroFlag=true;//checking firstRow zero
                break;
            }
        }
        for(int i=0;i<row;i++){
            if(a[i][0]==0){
                firstColZeroFlag=true;//checking firstColumn zero
                break;
            }
        }
        for(int i=1;i<row;i++){// use first row & column as markers
            for(int j=1;j<col;j++){
                if(a[i][j]==0){
                    a[i][0]=0;
                    a[0][j]=0;
                }
            }
        }
        for(int i=1;i<row;i++){//set zero based on the markers in the first row and column
            for(int j=1;j<col;j++){
                if(a[i][0]==0||a[0][j]==0) a[i][j] = 0;
            }
        }
        if(firstRowZeroFlag){
            for(int j=0;j<col;j++){
                a[0][j]=0;//set zero for first row
            }
        }
        if(firstColZeroFlag){
            for(int i=0;i<col;i++){
                a[i][0]=0;//set zero for first column
            }
        }
    }
    public static void main(String[] args) {
        int [][]x={{1,1,1},{1,0,1},{1,1,1}};//xample1
        System.out.println(Arrays.deepToString(x));
        bfSolution(x);
        System.out.println(Arrays.deepToString(x));
        System.out.println("---above by bruteForceSolution---below by optimalSolution---");
        int [][]o={{0,1,1},{1,1,1},{1,1,1}};//xample2
        System.out.println(Arrays.deepToString(o));
        optimalInPlaceSolution(o);
        System.out.println(Arrays.deepToString(o));
    }
}
