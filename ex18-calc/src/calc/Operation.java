package calc;

import java.util.stream.LongStream;


public enum Operation {
    SUM(n -> LongStream.of(n).reduce(0, Long::sum)), 
    SUBTRACTION(n -> LongStream.of(n). reduce(0, (n1, n2) -> n1 -n2));

    private Calc operationcCallBack;

    private Operation(Calc operationcCallBack) {
        this.operationcCallBack = operationcCallBack;
    }

    public Calc getOperationcCallBack() {
        return operationcCallBack;
    }

    
    
    
}
