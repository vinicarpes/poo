//Escreva um aplicativo em Java que l� uma entrada do usu�rio definindo o raio de um c�rculo e que;;;;
//imprime o di�metro, a circunfer�ncia e a �rea do c�rculo. Utilize o valor constante 3,14159 para ? (PI).
//Nota: voc� tamb�m pode utilizar a constante Math.PI predefinida para o valor de ?. Essa constante �
//mais precisa que o valor 3,14159. A classe Math � definida no pacote java.lang. Utilize as seguintes
//f�rmulas (onde r � o raio): di�metro = 2 * r, circunfer�ncia = 2? * r, �rea = ? * r2
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
                "Diam�tro = " + raio*2 + "\n" +
                "Circunfer�ncia = "+ df.format(2* Math.PI * raio) + "\n" +
                "�rea = " + df.format(Math.PI*Math.pow(raio, 2))
                        );
    }
    
}
