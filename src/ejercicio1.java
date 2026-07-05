import javax.swing.*;

public class ejercicio1 {
        public static void main(String[] args){
            int numero1, numero2;
            int suma;
            String primernumero = JOptionPane.showInputDialog("Digite el primer numero");
            numero1 = Integer.parseInt(primernumero);
            if (numero1 <0){
                JOptionPane.showMessageDialog(null, "Error: No se permite ingresar números negativos. El programa finalizará.");
                System.exit(0);
            }
            String segundonumero = JOptionPane.showInputDialog("Digite el segundo numero");
            numero2 = Integer.parseInt(segundonumero);
            numero1 = Integer.parseInt(primernumero);
            if (numero2 <0){
                if (numero1 <0){
                    JOptionPane.showMessageDialog(null, "Error: No se permite ingresar números negativos. El programa finalizará.");
                    System.exit(0);
                }
            }
            suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es:" +
                    suma,"Resultado",JOptionPane.PLAIN_MESSAGE);
            System.exit(0);

        }
    }

