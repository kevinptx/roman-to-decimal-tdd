package roman.to.decimal.tdd;

import java.math.BigDecimal;

public class RomanToDecimal {

    public BigDecimal convertToDecimal(String romanValue) {
        if(romanValue.isEmpty()){
            return new BigDecimal(0.0);
        } else if (romanValue.equals("I")) {
            return new BigDecimal(1.0);
        } else if (romanValue.equals("V")) {
            return new BigDecimal(5.0);
        } else if (romanValue.equals("X")){
            return new BigDecimal(10.0);
        } else if (romanValue.equals("L")){
            return new BigDecimal(50.0);
        }
        //figure if there's a condition that's returned no matter what. check for one of these values and then return something.
        //there still needs to be a return at the end which is a BigDecimal
        return new BigDecimal(500.0);
    }

}
