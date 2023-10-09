import javax.swing.JOptionPane;
public class Uppgift2 {
    public static void main(String[] args) {

        String s;
        s = JOptionPane.showInputDialog(null, "Hur många grader i Fahrenheit är det?");
        int Fahrenheit = Integer.parseInt(s);

        JOptionPane.showMessageDialog(null, "Det motsvarar " + (Fahrenheit-32)*5/9) + "grader i Celsius.";
    }
}
