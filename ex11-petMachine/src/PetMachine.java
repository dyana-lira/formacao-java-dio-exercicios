public class PetMachine {
    //propriedades
    private Pet pet;
    private int shampoo = 10;
    private int water = 30;
    private boolean clean = true;


    //funções
    //dar banho no pet
    public void takeAShower() {
        if (this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho");
            return;
        } //somente se um pet tiver sido passado como um parâmetro para a classe

        this.shampoo -= 2;
        this.water -= 10;
        pet.setClean(true); //determina que o pet está limpo
        System.out.printf("O pet %s está limpo", pet.getName());
        
    }

    //adicionar água
    public void addWater() {
        if (water == 30) {
            System.out.println("Capacidade de água no máximo");
            return;
        } //somente se o nível de água estiver abaixo de 30l 

        /*
            A verificação da capacidade de água precisa ser ajustada.
            Da forma como está, se a capacidade atual for 29, o método somará +2 l,
            mas a capacidade máxima é apenas de 30. 
            O correto: water >= 29 (capacidade excedida)
        */

        water += 2; //soma +2 l de água
    }

    //adicionar shampoo
    public void addShampoo() {
        if (shampoo == 10) {
            System.out.println("Capacidade de shampoo no máximo");
            return;
        }

        shampoo += 2;
    }

    //busca a informação de quantos litros de água possui na máquina
    public int getWater() {
        return water;
    }

    //busca a informação de quantos litros de shampoo possui na máquina    
    public int getShampoo() {
        return shampoo;
    }

    //verifica se há um pet na máquina
    public boolean hasPet() {
        return pet != null;
    }

    //adiciona um pet na máquina
    public void setPet(Pet pet) {
        if(!this.clean) {
            System.out.println("A máquina está suja. Limpe a máquina para o banho do próximo pet.");
            return;
        } //somente se a máquina estiver limpa
        if(hasPet()) {
            System.out.printf("O pet %s está na máquina.", pet.getName());
        } //somente se já não houver um pet na máquina

        this.pet = pet; //determina que o pet da máquina é igual ao pet recebido como parâmetro neste método
    }

    public void removePet() {
        this.clean = this.pet.isClean(); //determina o estado da máquina após o banho de acordo com o estado do pet;
        System.out.printf("o pet %s está limpo", pet.getName());

        this.pet = null; //determina valor nulo para o pet inserido na máquina = remove o pet da máquina
    }

    public void washMachine() {
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina está limpa");
    }



}
