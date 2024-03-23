// define a student class with fields like name and age, and use toString to print student details
public class ab_prob70 {
    String name;
    int age;
    String rollNumber;
    public ab_prob70(String name,int age,String rollNumber){
        this.name=name;
        this.age=age;
        this.rollNumber=rollNumber;
    }
    
    public String toString(){
        return "Student Details:{name:"+name+", age:"+age+", roll number:"+rollNumber+" }";
    }
    public static void main(String[] args) {
        ab_prob70 stu=new ab_prob70("Sachin",20,"001");
        System.out.println(stu);

        
    }
}
