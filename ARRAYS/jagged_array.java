import java.util.*;
public class jagged_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter no of rows : ");
        int rows = s.nextInt();
        int arr[][] = new int[rows][]; //jagged arrays initiated by " [rows][] "

        for(int i=0;i<rows;i++)
        {
            System.out.print("Enter no of columns "+ (i+1)+" : ");
            int columns = s.nextInt();
            arr[i] = new int[columns];

            System.out.print("Enter nums : ");
            for(int j=0;j<columns;j++)
            {
                arr[i][j] = s.nextInt();
            }
        }

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
