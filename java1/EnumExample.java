public class EnumExample {
    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
        }   
    public static void main(String[] args) {
    DayOfWeek today = DayOfWeek.SATURDAY;
    switch (today) {
    case MONDAY:
        System.out.println("it is monday");
        break;
    case FRIDAY:
        System.out.println("It is friday");
        break;
    default:
        System.out.println("It is Some other day");
    }
    }
    }
