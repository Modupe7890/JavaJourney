package Chapter8;

import java.sql.Time;

public class TestTime2 {
    public static void main(String[] args) {

        Time2 t1 = new Time2();
        Time2 t2 = new Time2(2);
        Time2 t3 = new Time2(21, 34);
        Time2 t4 = new Time2(12, 25, 42);
        Time2 t5 = new Time2(t4);
    }
}
