class Student{
    String name;
    int age;
    String gender;

    Student(String name , int age , String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
}

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Vivek", 20, "M");
        Student s2 = new Student("bunny", 20, "M");

        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
