package Matrix_2dArray;

public class TwoDimensionalArray
{
    public static void main(String[] args)
    {
        int [][] a={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        System.out.println(a.length);//no of cells.so, {{1,2,3},{4,5,6},{7,8,9}}.So, 3.
        System.out.println(a[0].length);//no of element in {1,2,3} like cell 1.So, 3.
    }
}
