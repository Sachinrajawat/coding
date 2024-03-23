public class a3_TestEmployee {
    public static void main(String[] args) {
        a3_prob79 emp=new a3_prob79("Sachin",20,30000);
        System.out.println(emp.getEmployeeDetails());
        emp.getName("Sachin rajawat");
        System.out.println(emp.getEmployeeDetails());
    }
}
