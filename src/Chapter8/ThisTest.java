package Chapter8;
// this used implicitly and explicitly to refer to members of an object.
public class ThisTest {
    public static void main(String[] args) {
        SimpleTime time = new SimpleTime(15, 30, 19);
        System.out.println(time.buildString());
    }
}
// class SimpleTime demonstrates the "this" reference
class  SimpleTime {
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String buildString(){
        return String.format("%24s: %s%n%24s: %s","this.toUniversalString()",
                this.toUniversalString(), "toUniversalString", toUniversalString);
    }
}
