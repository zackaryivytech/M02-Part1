import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {

    GregorianCalendar calendar = new GregorianCalendar();

    int year, month, day;


    public MyDate(){

        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        month = calendar.get(GregorianCalendar.MONTH);
        year = calendar.get(GregorianCalendar.YEAR);

    }

    public MyDate(int day, int month, int year){

        calendar = new GregorianCalendar();

        calendar.set(year, month, day);

        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(long time){
        setDate(time);
    }

    public void setDate(long elapsedTime){
        calendar.setTimeInMillis(elapsedTime);
        day = calendar.get(GregorianCalendar.DAY_OF_MONTH);
        month = calendar.get(GregorianCalendar.MONTH);
        year = calendar.get(GregorianCalendar.YEAR);
    }

    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }








}
