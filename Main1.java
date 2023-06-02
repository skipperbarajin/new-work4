import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Program {
    public static void main(String[] args) {
        // گرفتن 4 کلمه از کاربر با استفاده از دیالوگ
        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            words[i] = JOptionPane.showInputDialog(null, "لطفاً کلمه شماره " + (i+1) + " را وارد کنید:");
        }

        // مرتب کردن کلمات به صورت نزولی و چاپ آن‌ها
        Arrays.sort(words, Collections.reverseOrder());
        String sortedDescending = "کلمات به ترتیب نزولی: " + String.join(" ", words);
        JOptionPane.showMessageDialog(null, sortedDescending);

        // مرتب کردن کلمات به صورت صعودی و چاپ آن‌ها
        Arrays.sort(words);
        String sortedAscending = "کلمات به ترتیب صعودی: " + String.join(" ", words);
        JOptionPane.showMessageDialog(null, sortedAscending);
    }
}//chapter 4









/*import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // گرفتن 4 کلمه از کاربر
        String[] words = new String[4];
        for (int i = 0; i < 4; i++) {
            System.out.print("لطفاً کلمه شماره " + (i+1) + " را وارد کنید: ");
            words[i] = input.nextLine();
        }

        // مرتب کردن کلمات به صورت نزولی و چاپ آن‌ها
        Arrays.sort(words, Collections.reverseOrder());
        System.out.print("کلمات به ترتیب نزولی: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();

        // مرتب کردن کلمات به صورت صعودی و چاپ آن‌ها
        Arrays.sort(words);
        System.out.print("کلمات به ترتیب صعودی: ");
        for (String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }
}*/