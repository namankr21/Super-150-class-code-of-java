package lec41;

public class Person {
    
    private String name = "ramesh";
    private int age = 78;

    public Person(String name,int age)
    {
        this.age = 16;
        // this.name = "ravi";

    }

    public String getName() {
        return this.name;
    }

   
    public int getAge() {
        return age;
    }

    public void setAge(int age)  {
        try
        {
            if(age<0)
            {
                throw new Exception("Age can't be negative!!");
            }
            System.out.println("No exception!!");
            this.age = age;
        }
        catch(Exception excep)
        {
            excep.printStackTrace();
            System.out.println("Exception Generated!!");
        }
        finally
        {
            System.out.println("That's something which always works!!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    
}