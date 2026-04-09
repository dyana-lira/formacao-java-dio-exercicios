import java.util.Scanner;

public class App {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        int option = -1;
        GeometricForm geometricForm = null;

        while (true) {
            System.out.println("=================================================");
            System.out.println("Escolha a forma geométrica para calcular a área: ");
            System.out.println("1 - Circulo");
            System.out.println("2 - Retângulo");
            System.out.println("3 - Quadrado");
            System.out.println("4 - Sair do programa");

            option = scan.nextInt();

            if (option == 1) {
                geometricForm = createCircle();
            } else if (option == 2) {
                geometricForm = createRectangle();
            } else if (option == 3) {
                geometricForm = createSquare();
            } else if (option == 4) {
                System.out.println("Saindo do programa");
                break;
            } else {
                System.out.println("Opção inválida");
                continue;
            }

            System.out.printf("A área é igual a: %s\n", geometricForm.getArea());

        }

    }


    private static GeometricForm createSquare() {
        System.out.println("Informe o tamanho dos lados: ");
        var side = scan.nextDouble();

        return new Square(side);
    }

    private static GeometricForm createRectangle() {
        System.out.println("Informa a base: ");
        var base = scan.nextDouble();
        System.out.println("Informe a altura");
        var heigth = scan.nextDouble();

        return new Rectangle(heigth, base);
    }

    private static GeometricForm createCircle() {
        System.out.println("Informe o raio do circulo: ");
        var radius = scan.nextDouble();

        return new Circle(radius);
    }
}


