class Car{
    String brand;
    int speed;

    Car(){  //default constructor
        System.out.println("Default constructor");
    }

    Car(String brand , int speed){  //parametrized constructor
        this.brand = brand;
        this.speed = speed;
    }
}

public class Default_const {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("Volvo",150);

        System.out.println(c2.speed);

    }
}
