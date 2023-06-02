import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null, "لطفا تاریخ میلادی مورد نظر خود را به فرمت yyyy-MM-dd وارد کنید:");

        // تبدیل رشته ورودی به یک شیء از کلاس LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(input, formatter);

        // محاسبه روز تاریخ میلادی
        int dayOfYear = date.getDayOfYear();

        JOptionPane.showMessageDialog(null, "روز تاریخ مورد نظر شماره " + dayOfYear + " در سال است.");
    }
}//chapter4