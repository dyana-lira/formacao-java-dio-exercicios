import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura em centímetros (ex: 162cm): ");
        float height  = scan.nextFloat();
        System.out.print("Informe seu peso em Kg: ");
        float weight = scan.nextFloat();

        float heightMeters = height/100;

        float imc = weight/(heightMeters*heightMeters);

        System.out.printf("Seu IMC é %.2f\n", imc);

        var message = "";
                 
        if (imc <= 18.5) {
            message = "Abaixo do Peso";
        } else if (imc >= 18.6 && imc < 25.0) {
            message = "Peso Ideal";
        } else if (imc >= 25.0 && imc < 30.0) {
            message = "Levemente Acima do Peso";
        } else if (imc >= 30.0 && imc < 35.0) {
            message = "Obesidade Grau I";
        } else if (imc >= 35.0 && imc < 40.0) {
            message = "Obesidade Grau II (Severa)";
        } else {
            message = "Obesidade Grau III (Mórbida)";
        }

        System.out.println(message);

        scan.close();
    }
}
