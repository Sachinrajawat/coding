import java.util.*;

public interface CharacterClassifier {
boolean classifyCharacter(char ch);
}

public class CharacterTester {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Character: ");
        char inputChar = Scanner.next().charAt(0);
CharacterClassifier classifier=new CharacterClassifier() {
    public boolean classifyCharacter(char c){
        if(c=='a'||c=='e'||c='i'||c=='o'||c=='u'||c=='A'||c=='E'||c='I'||c=='O'||c=='U'){
            return true;
        }
        else return false;
    }
};
if(classifier.classifyCharacter(inputChar)){
    System.out.println("is vowel");
}
else{
    System.out.println("Is consonenet");
}
    }
}
