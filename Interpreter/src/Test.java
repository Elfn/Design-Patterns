public class Test {
    public InterpreterContext interpreterContext;

    public Test(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public static void main(String[] args) {

        String expr1 = "13 in Binary";
        String expr2 = "28 in Hexadecimal";

        Test interpreter = new Test(new InterpreterContext());

        System.out.println(expr1 +" = "+ interpreter.interpret(expr1));
        System.out.println(expr2 +" = "+ interpreter.interpret(expr2));

    }

    public  String interpret(String str){
        Expression expression = null;

        if(str.contains("Hexadecimal")){
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else if(str.contains("Binary")){
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0,str.indexOf(" "))));
        }else return "That expression "+"("+str+")"+" is not suitable";

        return expression.interPret(interpreterContext);
    }
}
