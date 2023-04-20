class Base
{
    Base()
    {
        System.out.println("default cons. of base");
    }
    Base(int a)
    {
        System.out.println("parameterized cons. of base");
    }
}
class derived extends Base
{
    derived(int x)
    {
        System.out.println("parameterized cons. of dirived");
    }
}


public class Inheritance {
    public static void main(String[] args) {
        derived d1=new derived(4);
    }
}
