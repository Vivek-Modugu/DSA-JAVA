import java.util.Scanner; 

public class square{
    public static int f(int x){
        int sq = x*x;
        return sq;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int res = f(num);
        System.out.println(res); 
    }

}
