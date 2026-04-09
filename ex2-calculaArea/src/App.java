import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho de um lado do quadrado: ");
        double lado = scan.nextDouble();
        //double area = lado*lado;
        double area = Math.pow(lado, 2);

        System.out.printf("Dado o tamanho %s dos lados do quadrado, a área do quadrado é igual a %s", lado, area);

        scan.close();
    }
}
