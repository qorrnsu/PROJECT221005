import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Practice {
    public static void main(String[] args) {
        Calendar now = Calendar.getInstance();

        int hourOfDay = now.get(Calendar.HOUR_OF_DAY);

        SimpleDateFormat formatter = new SimpleDateFormat("현재 시간은 HH시 mm분 입니다.");
        System.out.println(formatter.format(now.getTime()));

        if (4 <= hourOfDay && hourOfDay < 12)
            System.out.println("Good Morning");

        else if (12 <= hourOfDay && hourOfDay < 18)
            System.out.println("Good Afternoon");

        else if (18 <= hourOfDay && hourOfDay < 22)
            System.out.println("Good Evening");

        else
            System.out.println("Good Night");
    }
}

