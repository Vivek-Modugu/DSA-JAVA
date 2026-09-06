public class Methods {
    static void myMethod(String name,int age){
        if(age>18)
            System.out.println(name+", you are allowed");
        else
            System.out.println(name+", you are not allowed");
    }

    public static void main(String[] args) {
        myMethod("Vivek", 20);
    }
}
