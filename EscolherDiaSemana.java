import java.util.Scanner;

public class EscolherDiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escolha o dia da semana (1 a 7):");
        int numeroDia = scanner.nextInt();
        
        String diaSemana;

        switch(numeroDia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda-feira";
                break;
            case 3:
                diaSemana = "Terça-feira";
                break;
            case 4:
                diaSemana = "Quarta-feira";
                break;
            case 5:
                diaSemana = "Quinta-feira";
                break;
            case 6:
                diaSemana = "Sexta-feira";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
        }
        
        System.out.println("Você escolheu: " + diaSemana);
        
        scanner.close();
    }
}
