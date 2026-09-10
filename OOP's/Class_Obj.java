class Car{
    String brand = "bmw"; // pre-initialized
    int speed;
    String color;

    void start(){
        System.out.println("Car started");
    }

}

public class Class_Obj {
    public static void main(String[] args) {
        Car c1 = new Car();

        //c1.brand = "volvo";
        c1.speed = 170;
        c1.start();

        System.out.println(c1.brand);
    }
}
