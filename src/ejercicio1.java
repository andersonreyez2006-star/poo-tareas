import javax.swing.*;

public class ejercicio1 {

public static double voltaje= 0;
public static double carga;
public static double capacitador;

    public static void main(String[] args) {
        String voltajeText;
        String cargaText;
        String i = "==================================";
        cargaText = JOptionPane.showInputDialog("digite carga (Q)");
        voltajeText = JOptionPane.showInputDialog("ingrese voltaje (V)");

        voltaje = Double.parseDouble(voltajeText);
        carga = Double.parseDouble(cargaText);

        System.out.println("\tDATOS INGRESADOS");
        System.out.println(i);
        System.out.println("la carga es de: " + carga);
        System.out.println("El voltaje es de: "+ voltaje);


        if (carga == 0) {
            System.err.println("VALOR INVALIDO!!\nNO SE PUEDE DIVIDIR ENTRE 0!!");
        } else if (voltaje < 0 || carga < 0) {
            System.err.println("NO SE PUEDEN INGRESAR NUMERO NEGATIVOS");
        }
        else {
            cal_cap();
            System.out.println(i);
            System.out.println("El calculo realizado con la formula C = Q/V da como resultado de capacitancia: "+ capacitador);
        }

    }

        public static void cal_cap () {
            capacitador = carga / voltaje;
        }

}
