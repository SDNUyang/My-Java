package ch9;
import java.util.*;
public class TestGregrianCalendar {
    public static void main(String[] args){
        /**显示当前的年月日*/
        GregorianCalendar currentCalendar=new GregorianCalendar();
        System.out.println(currentCalendar.get(GregorianCalendar.YEAR)+"年"+currentCalendar.get(GregorianCalendar.MONTH)+"月"+currentCalendar.get(GregorianCalendar.DAY_OF_MONTH));

        /**用setTimeMills方法*/
        currentCalendar.setTimeInMillis(1234567898765L);
        System.out.println(currentCalendar.get(GregorianCalendar.YEAR)+"年"+currentCalendar.get(GregorianCalendar.MONTH)+"月"+currentCalendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
