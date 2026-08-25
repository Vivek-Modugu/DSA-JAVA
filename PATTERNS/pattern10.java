class pattern10{
    public static void main(String[] args) {
        int n = 5;
        int sp = n/2;
        int num = 1;
        int dig = 1;


        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=sp;j++){
                System.out.print("\t");
            }
            int dig1 = dig;
            for(int k=1;k<=num;k++){
                System.out.print(dig1+"\t");
                if(k <= num/2){
                    dig1++;
                }
                else{
                    dig1--;
                }
            }
            System.out.println("");
            if(i<=n/2){
                dig++;
                sp--;
                num+=2;
            }
            else{
                dig--;
                sp++;
                num-=2;
            }

        }
    }
}



//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1