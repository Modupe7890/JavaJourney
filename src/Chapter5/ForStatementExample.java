package Chapter5;

public class ForStatementExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++){
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (int i = 100; i >= 1; i--){
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (int i = 7; i <= 77; i += 7){
            System.out.printf("%d ", i);
        }
        System.out.println();

        for (int i = 20; i >= 2; i -= 2){
            System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
