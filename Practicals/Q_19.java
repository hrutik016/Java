class Person{
     String name;
     int age;
     float salary;

    public Person(String n, int a, float s)
    {
        name = n;
        age = a;
        salary = s;
    }

    public void showInfo()
    {
        System.out.println("My Name is " + name + " and my age is " + age + " and my salary is " + salary + ".");
    }
}

public class Q_19 {
    public static void main(String[] args) {
        Person obj = new Person("hrutik",20,65000.0f);
        obj.showInfo();
    }
}


