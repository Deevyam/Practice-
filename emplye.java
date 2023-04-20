import java.lang.String ;
class emp
{
    private String name;
    private int id;
    private int fee;
    //parameterised constructor
    public emp(int id,int fee,String name)
{
    this.id=id;
    this.fee=fee;
    this.name=name;
    System.out.println("id: "+id+" "+"fee: "+fee+" "+"name: "+name);
}
/*
 setter to recive data
 public  void setdata(int id,int fee,String name)
{
    this.id=id;
    this.fee=fee;
    this.name=name;
    System.out.println("id: "+id+" "+"fee: "+fee+" "+"name: "+name);
}
    }*/
    public void setFee(int fee)//setter fee
    {
        this.fee = fee;
    }

    public int getFee()  //getter fee

    {
        return fee;
    }
    public void setid(int id) //setter id
    {
        this.id = id;
    }
    public int getId() //getter id
    {
        return id;
    }
}


public class emplye
{
    public static void main(String[] args)
    {
        int num1;
        int num2;
    emp e1=new emp(2,1500,"deevyam");
    e1.setFee(16078);
 num1=e1.getFee();
    e1.setid(2);
 num2=e1.getId();
        System.out.println("changed fee "+num1);
        System.out.println("changed id "+num2);
    }
}