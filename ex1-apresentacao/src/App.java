import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        var name = scan.nextLine().strip();
        System.out.println("Digite sua idade: ");
        var age = scan.nextInt();

        /*Correções: 
            1 > Nome sempre deve retornar capitalizado. DONE
            2 > Remover espaços em branco no inicio e final do nome. DONE
            3 > Caso o usuário digite o nome completo, considere para a mensagem apenas o primeiro nome. DONE
            4 > Antes de informar a mensagem, confirme se o usuário deseja passar as informações novamente ou se deseja prosseguir assim mesmo.     

        */

        System.out.printf("Olá %s %s! Sua idade é %s anos\n", firstNameFormatted(name), lastNameFormatted(name), age);
        
        scan.close();
        
    }

    private static String firstNameFormatted(String name) {
        var listOfNames = name.split(" ");

        var nameFormatted = listOfNames[0]
        .substring(0, 1)
        .toUpperCase()
        .concat(listOfNames[0].substring(1));

        return nameFormatted;
    }

    private static String lastNameFormatted(String name) {
        var listOfNames = name.split(" ");
        var lengthList = listOfNames.length;

        var lastNameFormatted = listOfNames[lengthList - 1]
        .substring(0, 1)
        .toUpperCase()
        .concat(listOfNames[lengthList - 1].substring(1));

        return lastNameFormatted;
    }
}



