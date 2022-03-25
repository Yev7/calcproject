public class Main {
    public static void main(String[] args) {
        Addition add = new Addition();
        add.setX(10);
        add.setY(5);

        Subtraction subtract = new Subtraction();
        subtract.setX(20);
        subtract.setY(7);

        Multiplication multiply = new Multiplication();
        multiply.setX(25);
        multiply.setY(4);

        Division divide = new Division();
        divide.setX(100);
        divide.setY(10);

        Square square = new Square();
        square.setX(4);

        SquareRoot squareroot = new SquareRoot();
        squareroot.setX(16);

        Exponents exponent = new Exponents();
        exponent.setX(2);
        exponent.setY(3);

        Calculator[] operations = {add, subtract, multiply, divide, square, squareroot, exponent};

        for(Calculator calculations:operations){
            calculations.calculate();
        }

    }
}
