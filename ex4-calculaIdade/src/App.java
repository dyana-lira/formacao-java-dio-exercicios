import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/*
    (meu exercício extra) Escreva um código que receba nome e data de nascimento de um usuário e imprima a idade dele naquele momento. Deve-se considerar não somente o ano de nascimento, mas também o mês de nascimento e, se na data atual, o mês de aniversário já passou ou não. 
*/


public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        //definindo formatação para data
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("NOME: ");
        var name = scan.nextLine().strip();
        System.out.println("DATA DE NASCIMENTO (dd/MM/yyyy): ");

        //VARIÁVEIS
        LocalDate today = LocalDate.now(); //hoje
        var birthDateInput = scan.nextLine(); //input data de nascimento (String)
        LocalDate birthDate = LocalDate.parse(birthDateInput, formatter); //data de nascimento formatada (LocalDate)
        Period age = Period.between(birthDate, today); //idade do usuário (Period)
        LocalDate lastBirthDay = birthDate.plusYears(age.getYears()); //data do último aniversário (LocalDate)
        long sinceLastBirthDay = ChronoUnit.DAYS.between(lastBirthDay, today); //período desde o último aniversário até a data atual (em dias)
        long nextBirthday = ChronoUnit.DAYS.between(today, lastBirthDay.plusYears(1)); //período até o próximo aniversário (em dias)

        //SAÍDAS
        System.out.printf("Olá %s! Segue alguns detalhes sobre as informações que me passou...\n", nameFormatter(name));
        System.out.printf("Seu último aniversário foi em %s, há %s dias\n", formatter.format(lastBirthDay), sinceLastBirthDay);
        System.out.printf("Seu próximo aniversário será em %s dias\n", nextBirthday);
        System.out.printf("Sua idade exata é: %s anos, %s meses e %s dias\n", age.getYears(), age.getMonths(), age.getDays());


        scan.close();
    }

    private static String nameFormatter(String name) {
        var listOfInputNames = name.split(" ");

        var nameFormated = listOfInputNames[0]
        .substring(0, 1)
        .toUpperCase()
        .concat(listOfInputNames[0].substring(1));

        return nameFormated;
    }
}
