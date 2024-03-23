import java.util.Scanner;

public class a_prob57 {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.println("Enter month num: ");
    int num=in.nextInt();
    String month= switch(num){
        case 1->"Jan";
        case 2->"Feb";
        case 3->"Mar";
        case 4->"Apr";
        case 5->"May";
        case 6->"Jun";
        case 7->"Jul";
        case 8->"Aug";
        case 9->"Sep";
        case 10->"Oct";
        case 11->"Nov";
        case 12->"Dec";
default->"Please enter correct month";
    };
    System.out.println(month);
    

   } 
}
