import java.math.BigDecimal;

public class Main {
    public static void main(String[] args){
        String str = "string";

        //Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.Integer'
        //System.out.println(str instanceof Integer);


        BigDecimal bigDecimal1 =  new BigDecimal("1.5");
        BigDecimal bigDecimal2 =  new BigDecimal("1.50");


        System.out.println("1.5 add 1.50: " + bigDecimal1.add(bigDecimal2));
        //System.out.println("1.5 + 1.50: " + (bigDecimal1 + bigDecimal2)); //Operator '+' cannot be applied to 'java.math.BigDecimal', 'java.math.BigDecimal'

        System.out.println("1.5 divide 1.50: " + bigDecimal1.divide(bigDecimal2));
        //System.out.println("1.5 / 1.50: " + (bigDecimal1 / bigDecimal2)); //Operator '/' cannot be applied to 'java.math.BigDecimal', 'java.math.BigDecimal'

        System.out.println("1.5 multiply 1.50: " + bigDecimal1.multiply(bigDecimal2));
        //System.out.println("1.5 * 1.50: " + (bigDecimal1 * bigDecimal2)); //Operator '*' cannot be applied to 'java.math.BigDecimal', 'java.math.BigDecimal'
    }
}
