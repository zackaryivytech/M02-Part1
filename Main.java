public class Main {
    public static void main(String[] args)
    {

        MyDate currentDate = new MyDate();
        System.out.println(currentDate.year);
        System.out.println(currentDate.month);
        System.out.println(currentDate.day);

        MyDate date = new MyDate(561555550000L);
        System.out.println(date.year);
        System.out.println(date.month);
        System.out.println(date.day);
    }
}