import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        int choice=0;
        int[] seats = new int[10];
        boolean isEmpty = true;

        for(int i=0; i<10;i++){ //atribuindo 0 a todas as posições
            seats[i] =0;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("##########################################");
        System.out.println("MENU DE SELEÇÃO\nPressione 1 para Primeira Classe.\nPressione 2 para Classe Executiva.");
        System.out.println("##########################################");
        
        while (isEmpty) {
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                boolean seatAssigned = false;
                for(int i=0; i<5;i++){
                    if(seats[i] ==0){ //verficia se o assento está disponível
                        seats[i]=1;
                        System.out.println("Seu assento na PRIMEIRA CLASSE é: " + (i+1));
                        seatAssigned=true; //flag de reserva realizada
                        break;
                    }
                }   
                if (!seatAssigned) {
                    System.out.println("PRIMEIRA CLASSE cheia. Deseja ser alocado(a) para a CLASSE EXECUTIVA? \n1 - Sim \n2- Não");
                    int anwser = scanner.nextInt();
                    if(anwser==1){
                        for(int i=5;i<10;i++){
                            if (seats[i]==0) {
                                seats[i]=1;
                                System.out.println("Seu assento na CLASSE EXECUTIVA é: " + (i+1));
                                seatAssigned = true;
                                break;
                            }
                        }
                        if(!seatAssigned){
                            System.out.println("CLASSE EXECUTIVA também está lotada. Aguarde o próximo vôo.");
                        }
                    }else{
                        System.out.println("Aguarde o próximo vôo.");
                    }
                }
                break;
        
                case 2:
                seatAssigned=false;
                for(int i=5; i<10; i++){
                    if (seats[i]==0) {
                        seats[i]=1;
                    System.out.println("Seu assento na CLASSE EXECUTIVA é: " + (i+1));
                    break;                    
                }
            }
            break;
        }
        
        //verificar se o vetor todo equivale a 1
        
        int soma =0;
        for(int i =0; i<10;i++){
            soma+=seats[i];
            if (soma==10) {
                isEmpty = false;
            }
        }
    }  
        
        scanner.close();
    }
}
