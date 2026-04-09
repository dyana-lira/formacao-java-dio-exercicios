public class Pet {

    private final String name;
    private boolean clean;

    public Pet(String name) {
        this.name = name;
        this.clean = false;
    }

    /*
        A propriedade nome está definida como final, 
        portanto, não pode ser alterada após instância da classe e,
        por essa razão, não possuirá método set, 
        apenas o getter para capturar o nome declarado.
    */
    public String getName() {
        return name;
    }

    /*
        Esse é o método get da variável clean. 
        Basicamente, retorna qual o estado dela naquele momento,
        True ou False.
    */
    public boolean isClean() {
        return clean;
    }

    /*
        Por padrão, o Pet está sujo, portanto, Clean = False. 
        Depois que ele sair da máquina, o estado de clean deve ser alterado, 
        e essa alteração será realizada por meio do método abaixo. 
    */
    public void setClean(boolean clean) {
        this.clean = clean;
    }


}
