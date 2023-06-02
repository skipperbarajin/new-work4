import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        String countString = JOptionPane.showInputDialog(null, "لطفا تعداد نمرات را وارد کنید:");
        int count = Integer.parseInt(countString);

        int excellentCount = 0;
        int passCount = 0;
        int failCount = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < count; i++) {
            String gradeString = JOptionPane.showInputDialog(null, "لطفا نمره " + (i+1) + " را وارد کنید:");
            int grade = Integer.parseInt(gradeString);

            if (grade >= 90 && grade <= 100) {
                excellentCount++;
            } else if (grade >= 60 && grade <= 89) {
                passCount++;
            } else {
                failCount++;
            }

            sum += grade;

            if (grade < min) {
                min = grade;
            }

            if (grade > max) {
                max = grade;
            }
        }

        double average = (double) sum / count;

        String message = "تعداد نمرات ممتاز: " + excellentCount + "\n" +
                "تعداد نمرات قبول: " + passCount + "\n" +
                "تعداد نمرات مردود: " + failCount + "\n" +
                "میانگین نمرات: " + average + "\n" +
                "بیشترین نمره: " + max + "\n" +
                "کمترین نمره: " + min;

        JOptionPane.showMessageDialog(null, message);
    }
}//chapter 4