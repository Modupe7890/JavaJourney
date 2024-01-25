package Chapter6;

public class Scope {
    private static int x = 1;

    public static void main(String[] args) {
        int x = 5;
        System.out.printf("local x in main is %d%n", x);
    }
    public static void useLocalVariable(){
        int x = 25;
        System.out.printf("%nlocal x on entering method useLocalVariable is %d%n", x);
    }
}
