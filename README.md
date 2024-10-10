


Se a pessoa digitar 1, seu programa deve atribuir um assento na Primeira Classe (assentos 1-5). Se a
pessoa digitar 2, seu programa deve atribuir um assento na Classe Executiva (assentos 6-10). Seu
programa, então, deve imprimir um ticket de embarque indicando o número de assento da pessoa e se
ele está na Primeira Classe ou Classe Executiva do avião.

Utilize um array unidimensional de tamanho 10 para representar o gráfico de assentos do avião. Inicialize
todos os elementos do array com 0 para indicar que todos os assentos estão vazios. À medida que cada
assento é atribuído, configure os elementos correspondentes do array com 1 para indicar que o assento
não está mais disponível.

Naturalmente, seu programa nunca deve atribuir um assento que já foi atribuído. Quando a Primeira
Classe estiver lotada, seu programa deve solicitar à pessoa se é aceitável ser colocado na Classe
Executiva (e vice-versa). Se for, faça a atribuição apropriada de assento. Se não for, imprima a
mensagem “Aguarde o próximo vôo!!!”.


import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        int firstClass = 0, exeClass = 0, choice = 0;
        int[] seats = new int[10];
        Scanner sc = new Scanner(System.in); // Scanner para capturar a entrada do usuário

        while (true) { // Continua até que todos os assentos sejam preenchidos
            System.out.println("\n##########################################");
            System.out.println("MENU DE SELEÇÃO\nPressione 1 para Primeira Classe (Assentos 1-5).\nPressione 2 para Classe Executiva (Assentos 6-10).");
            System.out.println("##########################################");
            System.out.print("Escolha a classe (1 ou 2): ");
            choice = sc.nextInt(); // Captura a escolha do usuário

            switch (choice) {
                case 1:
                    boolean seatAssigned = false;
                    for (int i = 0; i < 5; i++) { // Primeira Classe (assentos 1-5)
                        if (seats[i] == 0) { // Se o assento está disponível
                            seats[i] = 1; // Marca o assento como ocupado
                            System.out.println("Seu assento na Primeira Classe é o número " + (i + 1));
                            seatAssigned = true;
                            break;
                        }
                    }

                    if (!seatAssigned) { // Caso Primeira Classe esteja cheia
                        System.out.println("A Primeira Classe está cheia. Deseja ir para a Classe Executiva? (1 = Sim, 2 = Não)");
                        int response = sc.nextInt();
                        if (response == 1) {
                            assignExecutiveSeat(seats); // Tenta atribuir um assento na Classe Executiva
                        } else {
                            System.out.println("Aguarde o próximo voo.");
                        }
                    }
                    break;

                case 2:
                    assignExecutiveSeat(seats); // Tenta atribuir um assento na Classe Executiva
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Verifica se todos os assentos estão ocupados
            if (isPlaneFull(seats)) {
                System.out.println("Todos os assentos foram preenchidos. Aguarde o próximo voo.");
                break;
            }
        }

        sc.close(); // Fecha o Scanner
    }

    // Função para atribuir assento na Classe Executiva
    public static void assignExecutiveSeat(int[] seats) {
        boolean seatAssigned = false;
        for (int i = 5; i < 10; i++) { // Classe Executiva (assentos 6-10)
            if (seats[i] == 0) { // Se o assento está disponível
                seats[i] = 1; // Marca o assento como ocupado
                System.out.println("Seu assento na Classe Executiva é o número " + (i + 1));
                seatAssigned = true;
                break;
            }
        }

        if (!seatAssigned) { // Caso Classe Executiva esteja cheia
            System.out.println("A Classe Executiva está cheia. Aguarde o próximo voo.");
        }
    }

    // Função para verificar se todos os assentos estão ocupados
    public static boolean isPlaneFull(int[] seats) {
        for (int seat : seats) {
            if (seat == 0) {
                return false; // Ainda há assentos disponíveis
            }
        }
        return true; // Todos os assentos estão ocupados
    }
}
