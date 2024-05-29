import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class datetime{
    public static void main(String[] args){
        LocalDate currentDate=LocalDate.now();
        LocalDate pastDate=LocalDate.of(2018,12,30);
        System.out.println(Duration.between(pastDate,currentDate).getDays());
        System.out.println(ChronoUnit.YEARS.between(currentDate, pastDate));
        LocalTime currentTime=LocalTime.now();
        LocalTime pastTime=LocalTime.of(20,12,31, 120);
        System.out.println(Duration.between(currentTime, pastTime).getSeconds());
    }
}