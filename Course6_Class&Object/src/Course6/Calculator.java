package Course6;

public class Calculator {
    public double num1;
    public double num2;
    public Calculator(double num1,double num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public double add(){//加法
        return this.num1+this.num2;
    }
    public String toAdd(){
        return num1 +" + "+num2+" = "+this.add();
    }

    public double sub(){//减法
        return this.num1 - this.num2;
    }
    public String toSub(){
        return num1 +" - "+num2+" = "+this.sub();
    }
    public double mul(){//乘法
        return this.num1 * this.num2;
    }
    public String toMul(){
        return num1 +" * "+num2+" = "+this.mul();
    }
    public double div(){//除法
        return this.num1 / this.num2;
    }
    public String toDiv(){
        return num1 +" / "+num2+" = "+this.div();
    }
    @Override
    public String toString() {
        return "Calculator{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public static void main(String[] args) {
        Calculator test = new Calculator(3.6,1.2);
        System.out.println(test.toString());
        System.out.println(test.toAdd());
        System.out.println(test.toSub());
        System.out.println(test.toMul());
        System.out.println(test.toDiv());
    }
}
