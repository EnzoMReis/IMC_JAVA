import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------------------------------");
        System.out.println("Programa Para Cálculo do IMC do Paciente");
        System.out.println("----------------------------------------");
        System.out.print("Digite o Nome do Paciente: ");
        String nome = scanner.nextLine();
        System.out.print("\nDigite o Peso do Paciente: ");
        double peso = scanner.nextDouble();
        System.out.print("\nDigite a Altura do Paciente: ");
        double altura = scanner.nextDouble();

        Paciente paciente = new Paciente(peso,altura);
        System.out.println("----------------------------------------");
        System.out.println(paciente);

        scanner.close();
    }
}
