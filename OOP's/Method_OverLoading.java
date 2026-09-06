public class Method_OverLoading {
    static int add(int a , int b){
        return a+b;
    }

    static int add(int a , int b , int c){
        return a+b+c;
    }

    static double add(double a , double b){
        return a+b;
    }

    public static void main(String[] args) {
        int a = add(2,3);
        int b = add(5,8 ,9);
        double c = add(2.4,7.01);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
