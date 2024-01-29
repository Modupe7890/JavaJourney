package Chapter6;

public class MethodOverLoad {
    public static void main(String[] args) {
        System.out.printf("Square of integer 7 is %d%n", square(7));
        System.out.printf("Square of double 7.5 is %f%n", sqaure(7.5));
    }
    public static int square (int intValue){
        System.out.printf("%nCalled square with int argument: %d%n", intValue);
    }
}
