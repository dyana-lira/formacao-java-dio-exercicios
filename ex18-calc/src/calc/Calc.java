package calc;

@FunctionalInterface
public interface Calc {
    /*
    os três pontos indica que a interface 
    pode receber vários argumentos do tipo especificado.
    */
    long exec(long... numbers);

}
