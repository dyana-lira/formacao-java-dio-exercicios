import java.util.Scanner;

public class App {

    private final static Scanner scan = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();


    public static void main(String[] args) throws Exception {
        int option = -1;

        do {
            System.out.println("Escolha uma das opções: ");
            System.out.println("1 - Iniciar banho");
            System.out.println("2 - Abastecer água");
            System.out.println("3 - Abastecer shampoo");
            System.out.println("4 - Verificar nível de água");
            System.out.println("5 - Verificar nível de shampoo");
            System.out.println("6 - Limpar máquina");
            System.out.println("7 - Verificar se tem pet na máquina");
            System.out.println("8 - Colocar pet na máquina");
            System.out.println("9 - Retirar pet da máquina");
            System.out.println("0 - Sair");

            option = scan.nextInt();

            switch (option) {
                case 1 -> petMachine.takeAShower();
                case 2 -> petMachine.addWater();
                case 3 -> petMachine.addShampoo();
                case 4 -> verifyWater();
                case 5 -> verifyShampoo();
                case 6 -> petMachine.washMachine(); 
                case 7 -> checkHasPet();
                case 8 -> setPetInPetMachine();
                case 9 -> petMachine.removePet();
                default -> System.out.println("opção inválida");
            }
            

        } while (option != 0);

    }

    public static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.printf("A máquina está com %s litros de água\n", amount);
    }

    public static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.printf("A máquina está com %s litro(s) de shampoo\n", amount);
    }

    public static void checkHasPet() {
        System.out.println(petMachine.hasPet() ? "Tem pet na máquina" : "Não tem pet na máquina");
    }

    public static void setPetInPetMachine() {
        var name = "";
        while (name == null || name.isEmpty()) {
            System.out.println("Informe o nome do Pet: ");
            name = scan.next();
            
        }

        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.printf("O pet s% está na máquina\n", pet.getName());
    }


}
