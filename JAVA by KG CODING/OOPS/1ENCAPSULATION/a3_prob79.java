public class a3_prob79 {//Employee class
    
    private String name;
    private int age;
    private double salary;
    a3_prob79(String name,int age,double salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    String getEmployeeDetails(){
        return "EmployeeDetails: Name:"+name+", Age:"+age+", Salary:"+salary;
    }
    public void getName(String name){
        this.name=name;
    }
    public void getAge(int age){
        this.age=age;
    }
    public void getSalary(double salary){
        this.salary=salary;
    }

    // private void displayEmployeeDetails(){
    //     System.out.println("Name: "+name);
    //     System.out.println("Age: "+age);
    //     System.out.println("Salary: "+salary);
    // }
    
}
