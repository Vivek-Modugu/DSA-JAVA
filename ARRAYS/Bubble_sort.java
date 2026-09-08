public class Bubble_sort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int l = arr.length;
        for(int i=0;i<l-1;i++){

            for(int j=0;j<l-1;j++){

                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
