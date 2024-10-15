import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        

        menuEscolha();
        
       
    }

    public static void menuEscolha() {
        int[] seats = new int[10];
        boolean isEmpty = true;

        for (int i = 0; i < 10; i++) { // Atribuindo 0 a todas as posições
            seats[i] = 0;
        }
        
        Scanner scanner = new Scanner(System.in);
        
        while (isEmpty) {
            System.out.println("\nMENU DE SELEÇÃO\nPressione 1 para Primeira Classe.\nPressione 2 para Classe Executiva.\nPressione 3 para ver os assentos disponíveis");
            System.out.println();
            int choice = scanner.nextInt();
            
            // Verificar se o vetor todo equivale a 1
            int soma = 0;
            for (int i = 0; i < 10; i++) {
                soma += seats[i];
                if (soma == 10) {
                    isEmpty = false;
                }
            }
            switch (choice) {
                case 1:
                    boolean seatAssigned = false;
                    for (int i = 0; i < 5; i++) {
                        if (seats[i] == 0) { // Verifica se o assento está disponível
                            seats[i] = 1;
                            System.out.println("Seu assento na PRIMEIRA CLASSE é: " + (i + 1));
                            seatAssigned = true; // Flag de reserva realizada
                            break;
                        }
                    }
                    if (!seatAssigned) {
                        System.out.println("PRIMEIRA CLASSE cheia. Deseja ser alocado(a) para a CLASSE EXECUTIVA? \n1 - Sim \n2- Não");
                        int anwser = scanner.nextInt();
                        if (anwser == 1) {
                            for (int i = 5; i < 10; i++) {
                                if (seats[i] == 0) {
                                    seats[i] = 1;
                                    System.out.println("Seu assento na CLASSE EXECUTIVA é: " + (i + 1));
                                    seatAssigned = true;
                                    break;
                                }
                            }
                            if (!seatAssigned) {
                                System.out.println("CLASSE EXECUTIVA também está lotada. Aguarde o próximo vôo.");
                            }
                        } else {
                            System.out.println("Aguarde o próximo vôo.");
                        }
                    }
                    break;

                case 2:
                    seatAssigned = false;
                    for (int i = 5; i < 10; i++) {
                        if (seats[i] == 0) {
                            seats[i] = 1;
                            System.out.println("Seu assento na CLASSE EXECUTIVA é: " + (i + 1));
                            seatAssigned = true;
                            break;
                        }
                    }
                    if (!seatAssigned) {
                        System.out.println("CLASSE EXECUTIVA lotada. Você deseja ser alocado(a) na PRIMEIRA CLASSE?  \n1 - Sim \n2 - Não");
                        int anwser = scanner.nextInt();
                        if (anwser == 1) {
                            for (int i = 0; i < 5; i++) {
                                if (seats[i] == 0) {
                                    seats[i] = 1;
                                    seatAssigned = true;
                                    System.out.println("Seu assento na PRIMEIRA CLASSE é: " + (i + 1));
                                    break;
                                }
                            }
                            if (!seatAssigned) {
                                System.out.println("PRIMEIRA CLASSE também está lotada. Aguarde o próximo vôo.");
                            }
                        } else {
                            System.out.println("Aguarde o próximo vôo.");
                        }
                    }
                    break;
                    
                case 3:
                    System.out.println("#################");    
                    System.out.println("ASSENTOS LIVRES\nPRIMEIRA CLASSE: \n");
                    for (int i = 0; i < 5; i++) {
                        int aux =0;
                        if (aux !=4) {
                            if(seats[i]==0){
                                System.out.println("Assento n° " + (i+1));
                            }
                        }else{
                            System.out.println("Não há assentos disponíveis!! Aguarde o próximo vôo.");
                        }
                        aux++;
                    }
                    System.out.println("CLASSE EXECUTIVA: \n");
                    for (int i = 5; i < 10; i++) {
                        int aux =0;
                        if (aux<4) {
                            if(seats[i]==0){
                                System.out.println("Assento n° " +(i+1));
                            }
                        }else{
                            System.out.println("Não há assentos disponíveis!! Aguarde o próximo vôo.");
                        }
                        aux++;
                    }
                    break;

        }
    }
        scanner.close();
    }
}
