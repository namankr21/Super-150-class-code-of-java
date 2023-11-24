package lec41;

public class Student_Client {
    public static void main(String[] args) {
        
        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = "RAM";
        s.age = 18;
        s.intro();
    }
}
