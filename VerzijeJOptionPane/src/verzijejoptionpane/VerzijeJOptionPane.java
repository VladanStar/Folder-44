package verzijejoptionpane;

import javax.swing.JOptionPane;

public class VerzijeJOptionPane {

    public static void main(String[] args) {
        while (true) {
            char ch = JOptionPane.showInputDialog(null, "Unesite karakter: ").charAt(0);

            if (ch > 'a' && ch < 'z') {

                JOptionPane.showMessageDialog(null, "Uneli ste znak");
            } else if (ch > '0' && ch < '9') {
                JOptionPane.showMessageDialog(null, "Uneli ste cifru");

            } else if (ch > 'A' && ch < 'Z') {
                JOptionPane.showMessageDialog(null, "Uneli ste veliko slovo");
            } else {
                JOptionPane.showMessageDialog(null, "Nedefinisan unos");
                
            }
           String sc = JOptionPane.showInputDialog(null, "Da li zelite da nastavite(da ili ne)");
            if(sc.equalsIgnoreCase("da")){
            continue;
            }
            else{
            break;
            }
        }
    }

}
