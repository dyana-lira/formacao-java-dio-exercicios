import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in); 

        //declaração de variáveis
        int firstNumber;
        int secondNumber;
        var option = "";


        System.out.print("Informe o primeiro número: ");
        firstNumber = scan.nextInt();

        do {
            System.out.print("Informe o segundo número que seja maior que o primeiro: ");
            secondNumber = scan.nextInt();
        } while (secondNumber < firstNumber);
        
        System.out.print("Escolha > [1] Par ou [2] Ímpar: ");
        option = scan.next(); 
              

        if (option.equalsIgnoreCase("1") || option.equalsIgnoreCase("Par")) {
            System.out.println(showPairSequence(firstNumber, secondNumber)); 
        } else {
            System.out.println(showOddSequence(firstNumber, secondNumber));
        }

        scan.close();

    }

    private static List showPairSequence(Integer firstNumber, Integer secondNumber) {
        List<Integer> sequence = new ArrayList<>();

        for (int i = firstNumber; i <= secondNumber; i++) {
                if (i % 2 == 0) continue;
                sequence.add(i);
            }  
        
        return sequence;
    }

    private static List showOddSequence(Integer firstNumber, Integer secondNumber) {
        List<Integer> sequence = new ArrayList<>();

        for (int i = firstNumber; i <= secondNumber; i++) {
                if (i % 2 != 0) continue;
                sequence.add(i);
            }  
        
        return sequence;
    }


}
