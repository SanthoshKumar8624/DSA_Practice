package Arrays;

import java.util.Arrays;

public class leftRotate
{
    public static void Reverse(int[] a, int start, int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args)
    {
        int [] a={1,2,3,4,5};
        System.out.println(Arrays.toString(a));

        int k=2;//rotation
        int n=a.length;
        k=k%n;


        Reverse(a,0,k-1);
        Reverse(a,k,n-1);
        Reverse(a,0,n-1);
        System.out.println(Arrays.toString(a));
    }
}

//Right Rotate by k      even this works but time complexity O(n*k) and space complexity O(1)
//int[] a = {1,2,3,4,5};
//int k = 3;
//k = k % a.length;
//
//for (int i = 0; i < k; i++)
//{
//  int f = a[a.length-1];
//  for (int j = a.length-1; j > 0; j--)
//  {
//     a[j] = a[j-1];
//  }
//  a[0] = f;
//}

//Left Rotate by k
//int[] a = {1,2,3,4,5};
//int k = 2;
//k = k % a.length;
//
//for (int i = 0; i < k; i++)
// {
//   int f = a[0];
//   for (int j = 0; j < a.length-1; j++)
//   {
//      a[j] = a[j+1];
//   }
//   a[a.length-1] = f;
//}