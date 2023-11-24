package lec42;

public class Student {

    String name = "Kaju";
    int age = 10;
    // koi bhi reference variable ko print krate samay internally OBJECT class ka toString() method chall jata h!!
    @Override
    public String toString()
    {
        return this.name  + " " + this.age;
    }

}