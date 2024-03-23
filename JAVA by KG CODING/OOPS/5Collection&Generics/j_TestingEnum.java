// import j_TestingEnum.Light;

public class j_TestingEnum {
public static void main(String[] args) {
    

    TrafficLight color = TrafficLight.RED;
    color = TrafficLight.YELLOW;
    System.out.println(color);
    Grade grade= Grade.B;
    System.out.println(grade);

    Light light=Light.valueOf("GREEN");
    System.out.println(light); 
    for (Light values : light.values()) {
        System.out.println(values);
    }
}

    public enum TrafficLight{
        RED, GREEN, YELLOW;
        }
    public enum Grade{
        A,B,C,D,E,F;
    }
    public enum Light{
        RED("Stop"), GREEN("Go"), YELLOW("Caution");

        private final String action;
        Light(String action){
            this.action=action;
        }
        }
}
