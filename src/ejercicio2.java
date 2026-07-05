import javax.swing.*;

public class ejercicio2 {

public static Double calc(double c1, double c2, double c3){
    return c1+c2+c3;
}
public static double calc_s(double c1, double c2, double c3){
    return (c1 * c2 * c3) / ((c2 * c3) + (c1 * c3) + (c1 * c2));
}
    public static void main(String[]args){
        String c1t,c2t,c3t;
        double c1 =0, c2=0, c3=0;
        String sC1 = JOptionPane.showInputDialog("Capacitor 1:");
        if (sC1 == null || sC1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No ingresó un dato. El programa finalizará.");
            System.exit(0);
        } else {
            try {
                c1 = Double.parseDouble(sC1); // Convertimos
                if (c1 <= 0) {
                    JOptionPane.showMessageDialog(null, "Error: Los valores deben ser mayores a cero. El programa finalizará.");
                    System.exit(0);
                }
            } catch (NumberFormatException e) { // Si puso letras en vez de números
                JOptionPane.showMessageDialog(null, "Error: Valor no válido. El programa finalizará.");
                System.exit(0);
            }
        }

        // ==========================================
        // CAPACITOR 2
        // ==========================================
        String sC2 = JOptionPane.showInputDialog("Capacitor 2:");
        if (sC2 == null || sC2.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No ingresó un dato. El programa finalizará.");
            System.exit(0);
        } else {
            try {
                c2 = Double.parseDouble(sC2);
                if (c2 <= 0) {
                    JOptionPane.showMessageDialog(null, "Error: Los valores deben ser mayores a cero. El programa finalizará.");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Valor no válido. El programa finalizará.");
                System.exit(0);
            }
        }

        // ==========================================
        // CAPACITOR 3
        // ==========================================
        String sC3 = JOptionPane.showInputDialog("Capacitor 3:");
        if (sC3 == null || sC3.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No ingresó un dato. El programa finalizará.");
            System.exit(0);
        } else {
            try {
                c3 = Double.parseDouble(sC3);
                if (c3 <= 0) {
                    JOptionPane.showMessageDialog(null, "Error: Los valores deben ser mayores a cero. El programa finalizará.");
                    System.exit(0);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Valor no válido. El programa finalizará.");
                System.exit(0);
            }
        }

        double mostrarDatos1 = calc(c1, c2, c3);
        double mostrarDatos2 = calc_s(c1, c2, c3);

        String t = "==================================================================";
        System.out.println(t);
        System.out.println("               CONFIRMACION DE DATOS             ");
        System.out.println(t);
        System.out.println("Capacitor 1: " + c1 + " uF");
        System.out.println("Capacitor 2: " + c2 + " uF");
        System.out.println("Capacitor 3: " + c3 + " uF");
        System.out.println();
        System.out.println("=================================================");
        System.out.println("                 RESULTADOS FINALES              ");
        System.out.println("=================================================");
        System.out.println("Capacitancia Equivalente en PARALELO: " + mostrarDatos1 + " uF");
        System.out.println("Capacitancia Equivalente en SERIE: " + mostrarDatos2 + " uF");
        System.out.println("=================================================");
        }
    }

