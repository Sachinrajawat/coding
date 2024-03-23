import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class k_prob98 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("India", "Delhi");
        map.put("Pakistan", "Islamabad");
        map.put("USA", "Washington");
        map.put("China", "Beiging");
        map.put("Nepal", "Bhutan");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Country name: ");
        String country = scanner.nextLine();
        if(map.containsKey(country)){
            System.out.println("Capital of "+country+" is: "+map.get(country));
        }
        else{
            System.out.println("This "+country+" doesn't exist");
        }
    }
}
