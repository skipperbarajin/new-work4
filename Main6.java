import java.util.Calendar;
import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

         // سال مورد نظر
        Scanner scanner=new Scanner(System.in);
        System.out.println("سال مورد نظر?");
        int year=scanner.nextInt();

        System.out.println("تقویم سال " + year + " شمسی:");
        System.out.println("--------------------");

        for (int month = 0; month < 12; month++) {
            Calendar calendar = Calendar.getInstance();
            calendar.set(year, month, 1);
            int daysInMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
            int firstDayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

            String monthName = getMonthName(month);

            System.out.println(monthName + ":");

            for (int i = 1; i < firstDayOfWeek; i++) {
                System.out.print("   ");
            }

            for (int day = 1; day <= daysInMonth; day++) {
                System.out.printf("%2d ", day);

                if ((day + firstDayOfWeek - 1) % 7 == 0) {
                    System.out.println();
                }
            }

            System.out.println();
            System.out.println("--------------------");
        }
    }

    public static String getMonthName(int month) {
        String[] monthNames = {"فروردین", "اردیبهشت", "خرداد", "تیر", "مرداد", "شهریور", "مهر", "آبان", "آذر", "دی", "بهمن", "اسفند"};
        return monthNames[month];
    }
}