package lab3;
import java.time.format.DateTimeFormatter;
import java.time.
*;
import java.util.Scanner;
public class DateandTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter event date and time (yyyy-MM-dd HH:mm): ");
        String input = scanner.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime eventDateTime = LocalDateTime.parse(input, formatter);
        LocalDateTime cd = LocalDateTime.now();
        if (eventDateTime.isBefore(cd)) {
            System.out.println("The event has already passed.");
        } else {
            Duration duration = Duration.between(cd, eventDateTime);
            long totalMinutes = duration.toMinutes();
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;
            System.out.println("Time remaining until event:");
            System.out.println("\t" + days + " days, " + hours + " hours, and " + minutes + " minutes");
        }
        scanner.close();
    }
}
