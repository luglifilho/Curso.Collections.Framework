import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String a = JOptionPane.showInputDialog("Numerador: ");
        String b = JOptionPane.showInputDialog("Denominador: ");

        try{
            int resultado = dividir(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + resultado);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Entrada inválida, informe um número inteiro! " + e.getMessage());

        }

        System.out.println("Hello world!");
    }

    private static int dividir(int a, int b) {
        return a /b;
    }
}


