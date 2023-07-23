package dsa.array.medium;

import java.util.ArrayList;

public class sipralmatrix {
    public static void main(String[] args) {
        int matrix[][]={{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15,16}};
        ArrayList<Integer> al=spirallyTraverse(matrix,4,4);
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
    static ArrayList<Integer> spirallyTraverse(int matrix[][],int r,int c)
    {
        ArrayList<Integer> al=new ArrayList<Integer>(r*c);
        int row=0;
        int col=0;
        int lrow=r-1;
        int lcol=c-1;
        while(true)
        {

            for(int j=col;j<=lcol;j++)
            {
                al.add(matrix[row][j]);
            }
            row++;
            if(row>=lrow||col>=lcol)
            {
                break;
            }
            for(int i=row;i<=lrow;i++)
            {
                al.add(matrix[i][lcol]);
            }
            lcol--;
            if(row>=lrow||col>=lcol)
            {
                break;
            }
            for(int j=lcol;j>=col;j--)
            {
                al.add(matrix[lrow][j]);
            }
            lrow--;
            if(row>=lrow||col>=lcol)
            {
                break;
            }
            for(int i=lrow;i>=row;i--)
            {
                al.add(matrix[i][col]);
            }
            col++;
            if(row>=lrow||col>=lcol)
            {
                break;
            }
        }
        return al;
    }
}
