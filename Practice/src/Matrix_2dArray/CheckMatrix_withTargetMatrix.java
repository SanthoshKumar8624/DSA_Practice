package Matrix_2dArray;

import java.util.Arrays;

public class CheckMatrix_withTargetMatrix
{
    public static boolean checkMatTarget(int[][] m, int[][] t)
    {
        for(int i = 0; i <4; i++)//rotating the matrix four times like 90,180,270.
        {
            if(Arrays.deepEquals(m,t))
            {
                return true;
            }
            m=rotateMatrix(m);
        }
        return false;
    }
    public static int [] [] rotateMatrix(int[][] m)
    {
        int n=m.length;
        int [] [] newMatrix = new int [n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                newMatrix[i][j]=m[n-j-1][i];
            }
        }
        return newMatrix;
    }
    public static void main(String[] args)
    {
        int [][] matrix = {{1,0},{0,1}};
        int [][] target = {{0,1},{1,0}};
        System.out.println(Arrays.deepToString(matrix));
        System.out.println(Arrays.deepToString(target));
        System.out.println(checkMatTarget(matrix,target));
    }
}
