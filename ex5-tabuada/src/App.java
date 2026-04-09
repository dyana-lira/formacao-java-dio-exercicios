import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número para ver sua tabuada (digite 0 para sair): ");
            int number = scan.nextInt();

            if (number == 0) break;

            for (int i = 1; i <= 10; i++) {
                System.out.printf("%s X %s = %s\n", number, i, (number * i));
            }
        } 
        
    }
}
