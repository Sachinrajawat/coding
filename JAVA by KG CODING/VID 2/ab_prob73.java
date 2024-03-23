//simulate a dice roll using Math.random() and display the outcome (1 to 6)
public class ab_prob73 {
    public static void main(String[] args) {
        double random=6*Math.random();
        int currRoll=(int)Math.ceil(random);
        System.out.println("Random num between (1 to 6) is: "+currRoll);
    }
}
