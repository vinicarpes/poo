//Escreva um aplicativo em Java que lê uma entrada do usuário definindo o raio de um círculo e que;;;;
//imprime o diâmetro, a circunferência e a área do círculo. Utilize o valor constante 3,14159 para ? (PI).
//Nota: você também pode utilizar a constante Math.PI predefinida para o valor de ?. Essa constante é
//mais precisa que o valor 3,14159. A classe Math é definida no pacote java.lang. Utilize as seguintes
//fórmulas (onde r é o raio): diâmetro = 2 * r, circunferência = 2? * r, área = ? * r2
package exerc2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Exerc2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        DecimalFormat df = new DecimalFormat("0.00");
        float raio = Float.parseFloat(
                JOptionPane.showInputDialog("Insira o valor do raio: ")
        );
        
        JOptionPane.showMessageDialog(null, 
                "Raio = " + raio + "\n" +
                "Diamêtro = " + raio*2 + "\n" +
                "Circunferência = "+ df.format(2* Math.PI * raio) + "\n" +
                "Área = " + df.format(Math.PI*Math.pow(raio, 2))
                        );
    }
    
}
