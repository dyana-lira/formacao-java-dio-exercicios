import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.print("NOME: ");
        var nameFirst = scan.nextLine().strip();

        System.out.print("IDADE: ");
        var ageFirst = scan.nextLine();

        System.out.println("--------------------------");

        System.out.println("Dados da segunda pessoa:");
        System.out.print("NOME: ");
        var nameSecond = scan.nextLine().strip();

        System.out.print("IDADE: ");
        var ageSecond = scan.nextLine();

        int ageFirstInt = Integer.parseInt(ageFirst);
        int ageSecondInt = Integer.parseInt(ageSecond);
        int ageDifference;

        if (ageFirstInt > ageSecondInt) {
            ageDifference = ageFirstInt-ageSecondInt;
        } else {
            ageDifference = ageSecondInt-ageFirstInt;
        }


        System.out.printf("A diferença de idade entre %s e %s é de %s anos", formatName(nameFirst), formatName(nameSecond), ageDifference);

        scan.close();
    }


    private static String formatName(String name) {
        var listOfNames = name.split(" ");

        var nameFormatted = listOfNames[0]
        .substring(0, 1)
        .toUpperCase()
        .concat(listOfNames[0].substring(1));

        return nameFormatted;

    }
}
