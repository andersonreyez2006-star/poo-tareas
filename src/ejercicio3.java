import javax.swing.JOptionPane;

public class ejercicio3{

    // Constante obligatoria para la densidad
    private static final double DENSIDAD_GASOLINA = 0.750;

    // Método básico para pedir el radio
    public static double solicitarRadio() {
        String input = JOptionPane.showInputDialog("Radio (metros):");
        if (input == null || input.isEmpty()) System.exit(0);

        double radio = Double.parseDouble(input);
        if (radio <= 0) {
            JOptionPane.showMessageDialog(null, "Error: No se permite ingresar números negativos. El programa finalizará.");
            System.exit(0);
        }
        return radio;
    }

    // Método básico para pedir la altura
    public static double solicitarAltura() {
        String input = JOptionPane.showInputDialog("Altura (metros):");
        if (input == null || input.isEmpty()) System.exit(0);

        double altura = Double.parseDouble(input);
        if (altura <= 0) {
            JOptionPane.showMessageDialog(null, "Error: No se permite ingresar números negativos. El programa finalizará.");
            System.exit(0);
        }
        return altura;
    }

    // Métodos para los cálculos
    public static double calcularDiesel(double r, double h) {
        return (Math.PI * Math.pow(r, 2) * h) * 1000; // Retorna Litros
    }

    public static double calcularGasolina(double litros) {
        return litros * DENSIDAD_GASOLINA; // Retorna Kilogramos
    }

    // Único método para mostrar las salidas en consola
    public static void mostrarResultados(double r, double h, double d, double g) {
        System.out.println("Radio ingresado: " + r + " m");
        System.out.println("Altura ingresada: " + h + " m");
        System.out.println("Volumen Diesel: " + d + " L");
        System.out.println("Masa Gasolina: " + g + " kg");
    }

    // El main solo almacena e invoca
    public static void main(String[] args) {
        double radio = solicitarRadio();
        double altura = solicitarAltura();

        double litrosDiesel = calcularDiesel(radio, altura);
        double kgGasolina = calcularGasolina(litrosDiesel);

        mostrarResultados(radio, altura, litrosDiesel, kgGasolina);
    }
}
