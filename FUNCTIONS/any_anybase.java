import java.util.*;
class any_anybase{

    public static int conv_dec(int x,int x_b){
        int dec = 0;
        int p = 0;
        while(x>0){
            int q = x%10;
            dec = dec + q * (int)Math.pow(x_b,p);
            x = x/10;
            p++;
        }
        return dec;
    }

    public static void f_base(int z,int y){
        int res = 0;
        int p = 0;
        while(z>0){
            int q = z%y;
            res = res + q * (int)Math.pow(10,p);
            z = z/y;
            p++;
        }
        System.out.println("Requried number with base "+y+" : "+res);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = s.nextInt();
        System.out.print("Enter the base of the number you entered : ");
        int num_base = s.nextInt();
        System.out.print("Enter the base that you want to convert it into : ");
        int base = s.nextInt();

        int val = conv_dec(num, num_base);

        f_base(val, base);
    }
}