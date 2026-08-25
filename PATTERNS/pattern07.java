class pattern07{
    public static void main(String[] args) {
        
        int n = 5;
        int osp = n/2;
        int isp = -1;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=osp;j++){
                System.out.print("\t");
            }
            System.out.print("*\t");
            for(int k=1;k<=isp;k++){
                System.out.print("\t");
            }
            if(i!=1 && i!=n){
                System.out.print("*\t");
            }
            System.out.println("");

            if(i<n/2+1){
                osp--;
                isp+=2;
            }
            else{
                osp++;
                isp-=2;
            }
        }
    }
}


//                 *
//         *               *
// *                               *
//         *               *
//                 *