package Caneta;

//representação do objeto caneta

public class Caneta {
    
    public String cor;
    public String marca;
    public int carga =100;
    public boolean tampada;
    public float ponta;
    
    public void escrever(String msg){
        System.out.println("Escrevendo........" + msg);
    }
    
    public void pintar(){
        System.out.println("Pintando..........");
    
    }
}
