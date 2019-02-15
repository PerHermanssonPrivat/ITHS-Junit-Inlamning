public class BasicMath {
        public int div(int a, int b) {
            if (b == 0){
                throw new ArithmeticException("Divide by zero is not allowed!");
            }
            else {
                return a / b;
            }

        }

        public int add(int a, int b)
        {
            return a+b;
        }

        public int multiply(int a, int b){
            return a*b;
        }

        public int subtract (int a, int b) {return a-b; }
}


