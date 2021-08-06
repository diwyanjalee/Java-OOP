public class Test {
    public static void main(String[] args)
    {
        Emp e1 = new Emp(0, "mark");
        //e1.setEmpId(0);
       // e1.setEmpName("saman");

        //Emp e2 = new Emp();
        //e2.empId=0;
        //e2.setEmpName("ruwan");


        System.out.println(e1.getEmpName() + e1.getEmpId());
    }

}

class Emp {

    private int empId;
    private String empName;

    public Emp(int empId, String empName){
       this.setEmpId(empId);
       this.setEmpName(empName);
    }

    public Emp(){

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        if (empId <= 0 )
        {

            throw new RuntimeException("Your Id should be grater than 0 and ");

        }
        this.empId = empId;

    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {

        this.empName = empName;
    }

}