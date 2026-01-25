package Matrix_2dArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralMatrix
{
    public static List<Integer> solution(int[][] matrix)
    {
        List<Integer> result = new ArrayList<>();
        int top=0;
        int bottom=matrix.length-1;
        int left=0;
        int right=matrix[0].length-1;
        while(top<=bottom && left<=right)
        {
            for(int col=left;col<=right;col++)//left->right
            {
                result.add(matrix[top][col]);//top row
            }
            top++;
            for(int row=top;row<=bottom;row++)//top->bottom
            {
                result.add(matrix[row][right]);//right column
            }
            right--;
            if(top<=bottom)
            {
                for(int col=right;col>=left;col--)//right->left
                {
                    result.add(matrix[bottom][col]);//bottom row
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int row=bottom;row>=top;row--)//bottom->top
                {
                    result.add(matrix[row][left]);//left column
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int [][] a={{1,2,3},
                    {4,5,6},
                    {7,8,9}};
        System.out.println(Arrays.deepToString(a));
        System.out.println(solution(a));
    }
}
