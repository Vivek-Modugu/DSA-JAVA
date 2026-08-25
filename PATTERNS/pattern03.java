public class pattern03 {
    public static void main(String[] args) {
        int n = 5;
        int sp = n/2;
        int st = 1;

        for(int i=0;i<n;i++){
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }

            for(int k=1;k<=st;k++){
                System.out.print("*\t");
            }

            System.out.println();

            if(i < (n/2)){
                sp--;
                st+=2;
            }

            else{
                sp++;
                st-=2;
            }
        }
    }
}

//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *
