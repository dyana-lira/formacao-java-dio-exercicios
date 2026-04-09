import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int firstNumber;

        System.out.print("Informe o primeiro número: ");
        firstNumber = scan.nextInt();

        while (true) {
            System.out.print("Informe o próximo número: ");
            int next = scan.nextInt();

            if (next < firstNumber) {
                System.out.printf("Informe um número maior que %s...\n", firstNumber);
                continue;
            }

            var result = next % firstNumber;
            if (result != 0) break;

            System.out.printf("%s / %s = %s\n", next, firstNumber, result);

        }

        System.out.println("Finalizando...");

        scan.close();

    }
}
