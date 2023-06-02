import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int room = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Room number:"));
        int cap = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Capacity:"));
        int enroll = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter Enrollment:"));
        int empty = (cap - enroll);
        if (empty == 0) {
            JOptionPane.showMessageDialog(null, "Room number: " + room + "\n" + "Capacity: "
                    + cap + "\n" + "Enrollment: " + enroll + "\n" + "empty capacity: " + empty + "\n" + "this class is full!!");
        }
        else {
            JOptionPane.showMessageDialog(null, "Room number: " + room + "\n" + "Capacity: "
                    + cap + "\n" + "Enrollment: " + enroll + "\n" + "empty capacity: " + empty + "\n" + "this class is not full");
        }
    }
}
//chapter 4