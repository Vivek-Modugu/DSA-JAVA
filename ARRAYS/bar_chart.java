import java.util.Scanner;
public class bar_chart {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];
        arr[0] = s.nextInt();
        int max = arr[0];
         
        for(int i=1;i<n;i++){
            arr[i] = s.nextInt();
            if(arr[i] > max)
                max = arr[i];
        }

        for(int i=max;i>=1;i--){
            for(int j=0;j<n;j++){
                if(i<=arr[j])
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
