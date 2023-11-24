package lec41;

public class Person_Client {
    public static void main(String[] args)  {
        
        Person p = new Person("riya" , 18);
        p.setName("riya");
        System.out.println(p.getName());
        p.setAge(10);
        System.out.println(p.getAge());
        

    }
}