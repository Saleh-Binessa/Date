import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
    public static void main(String[] args) {
        // Current date
        Date currentDate = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd - HH:mm:ss");
        String formattedDate = formatter.format(currentDate);
        System.out.println("Formatted Date & Time    : " + formattedDate);
        System.out.println("------------------------------------------------");

        // After 1 week
        Calendar week1 = Calendar.getInstance();
        week1.setTime(currentDate);
        week1.add(Calendar.DAY_OF_MONTH, 7);
        Date weekOne = week1.getTime();

        // After 2 weeks
        Calendar week2 = Calendar.getInstance();
        week2.setTime(currentDate);
        week2.add(Calendar.DAY_OF_MONTH, 14);
        Date weekTwo = week2.getTime();

        // After 3 weeks
        Calendar week3 = Calendar.getInstance();
        week3.setTime(currentDate);
        week3.add(Calendar.DAY_OF_MONTH, 21);
        Date weekThree = week3.getTime();

        // After 4 weeks
        Calendar week4 = Calendar.getInstance();
        week4.setTime(currentDate);
        week4.add(Calendar.DAY_OF_MONTH, 28);
        Date weekFour = week4.getTime();

        // Week 1
        String formattedWeek1 = formatter.format(weekOne);
        System.out.println("Date & Time after 1 week : " + formattedWeek1);
        System.out.println("------------------------------------------------");

        // Week 2
        String formattedWeek2 = formatter.format(weekTwo);
        System.out.println("Date & Time after 2 weeks: " + formattedWeek2);
        System.out.println("------------------------------------------------");

        // Week 3
        String formattedWeek3 = formatter.format(weekThree);
        System.out.println("Date & Time after 3 weeks: " + formattedWeek3);
        System.out.println("------------------------------------------------");

        // Week 4
        String formattedWeek4 = formatter.format(weekFour);
        System.out.println("Date & Time after 4 weeks: " + formattedWeek4);
        System.out.println("------------------------------------------------");

    }
}
