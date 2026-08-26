import java.util.*;
public class dec_to_any {

    public static void dec_any(int x , int y){
        int res = 0;
        int p = 0;
        while(x>0){
            int q = x%y;
            res = res + q * (int)Math.pow(10,p);
            x = x/y;
            p++;
        }
        System.out.println("Coverted the number into base "+y+": "+res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the decimal number : ");
        int n = s.nextInt();
        System.out.print("Enter the base you want to convert it into (2/8) : ");
        int base = s.nextInt();

        dec_any(n, base);
    }
}
