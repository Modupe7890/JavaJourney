package Chapter8;
// Time2 class declaration with overloaded constructors.
public class Time2 {

    private int hour;
    private int minute;
    private int second;

    // Time2 no-argument constructor:
    // initializes each instance variable to zero
    public Time2(){
        this(0, 0, 0); // invoke constructor with three arguments
    }
    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour){
        this(hour, 0, 0);
    }
    // Time2 constructor: hour and minute supplied, second defaulted to 0
    public Time2(int hour, int minute){
        this(hour, minute, 0);
    }
    public Time2(int hour, int minute, int second){

    }
}
