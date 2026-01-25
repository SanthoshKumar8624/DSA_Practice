package Matrix_2dArray;
import java.util.Arrays;
public class RotateImage
{
    public static void rotateMatrix(int[][] m)
    {
        int n = m.length;
        for(int i = 0; i < n; i++)//Transpose happens here
        {
            for(int j = i; j < n; j++)
            {
                int temp = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++)// Reverse each row here
        {
            int left = 0;
            int right = n - 1;
            while(left < right)
            {
                int temp = m[i][left];
                m[i][left] = m[i][right];
                m[i][right] = temp;
                left++;
                right--;
            }
        }
    }
    public static void main(String[] args) {
        int [][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        rotateMatrix(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
}
