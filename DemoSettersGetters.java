class Employe{
    private String empname;
    private int empage;
    private float empsal;
    public Employe()
    {
        empname="Compuhelp";
        empage=20;
        empsal=50000;
        System.out.println("the name is"+empname);
    }

    public String getEmpname() {
        return empname;//getter
    }

    public void setEmpname(String empname) {
        this.empname = empname;//setter
    }
    public int getEmpage() {
        return empage;
    }

    public void setEmpage(int empage) {
        this.empage = empage;
    }

    public float getEmpsal() {
        return empsal;
    }

    public void setEmpsal(float empsal) {
        this.empsal = empsal;
    }
}
public class DemoSettersGetters {
    public static void main(String[] args) {
        Employe em=new Employe();
        em.setEmpage(10);
       em.getEmpage();
    }
}