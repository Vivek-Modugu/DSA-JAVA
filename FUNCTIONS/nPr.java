import java.util.Scanner;
public class nPr {

    public static int fact(int x){
        int rv = 1;
        for(int i=1;i<=x;i++){
            rv = rv*i;
        }
        return rv;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();

        int nfact = fact(n);
        int nmfact = fact(n-r);

        int res = nfact/nmfact;
        System.out.println(n+"P"+r+" = "+res);
    }
}
