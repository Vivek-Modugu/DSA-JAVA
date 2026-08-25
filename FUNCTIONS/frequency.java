import java.util.Scanner;
public class frequency {

    public static void freq(int x){
        int val = 0;
        while(x>0){
            x = x/10;
            val++;
        }
        System.out.println("Frequency of the digit is : "+val);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        freq(num);
    }    
}
