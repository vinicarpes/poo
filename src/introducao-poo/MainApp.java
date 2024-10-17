
import Caneta.Caneta;
import java.util.Scanner;

public class MainApp{
    public static void main(String[] args) {
        Caneta canetaFaberCastel = new Caneta();
        Caneta canetaBic = canetaFaberCastel; //atribui a mesma referência de memória de um mesmo objeto a duas variáveis
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual a cor de sua caneta Faber Castel?");
        
        canetaFaberCastel.cor = scanner.next();
        
        System.out.println("Cor da caneta Faber Castel: " + canetaFaberCastel.cor);
        
        canetaFaberCastel.carga = 90;
        canetaFaberCastel.tampada = false;
        canetaFaberCastel.marca = "Faber Castel";
        canetaFaberCastel.ponta = 0.7F;
        
        canetaFaberCastel.escrever("Aula de POO");
        canetaFaberCastel.pintar();
        
        canetaBic.marca = "FaberCastel";
        
//        System.out.println(canetaBic.marca);
//        System.out.println(canetaFaberCastel.marca);
        
        scanner.close();
    }
    
}
