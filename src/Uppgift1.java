import javax.swing.JOptionPane;

public class Uppgift1 {
    public static void main(String[] args) {
        String s;
        s = JOptionPane.showInputDialog(null, "Sfärens radie?");
        double r = Double.parseDouble(s);

        double Area = 4*3.14*r*r;
        double Volym = 4*3.14*r*r*r/3;

        JOptionPane.showMessageDialog(null, "Arean på sfären är " + Area+ "enhet^2. Volymen är " + Volym + "enhet^3");




    }
}