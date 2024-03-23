public class k_prob97 {
    
    public static void main(String[] args) {

        for (Day values : Day.values()) {
            System.out.printf("%s : %s\n",values,values.getType());
        }

    }

    public enum Day{
        MONDAY(true), TUESDAY(true), WEDNESDAY(true),
        THURSDAY(true), FRIDAY(true), SATURDAY(false),SUNDAY(false);
        private final boolean isWeekday;
        Day(boolean isWeekday){
            this.isWeekday=isWeekday;
        }

        public String getType(){
            return isWeekday?"Weekday":"Weekend";
        }
    }
}
