package chapter6.example.example11;

import java.util.Calendar;

public class CalendarEx
{
    public static void PrintCalendar(String msg, Calendar Cal)
    {
        int Year = Cal.get(Calendar.YEAR);
        int Month = Cal.get(Calendar.MONTH)+1;
        int Day = Cal.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek = Cal.get(Calendar.DAY_OF_WEEK);
        int Hour = Cal.get(Calendar.HOUR);
        int hourOfDay = Cal.get(Calendar.HOUR_OF_DAY);
        int AmPm = Cal.get(Calendar.AM_PM);
        int Minute = Cal.get(Calendar.MINUTE);
        int Second = Cal.get(Calendar.SECOND);
        int MilliSecond = Cal.get(Calendar.MILLISECOND);

        System.out.print(msg+Year+"/"+Month+"/"+Day+"/");
        switch (dayOfWeek)
        {
            case Calendar.SUNDAY:
                System.out.print("일요일");
                break;
            case Calendar.MONDAY:
                System.out.print("월요일");
                break;
            case Calendar.TUESDAY:
                System.out.print("화요일");
                break;
            case Calendar.WEDNESDAY:
                System.out.print("수요일");
                break;
            case Calendar.THURSDAY:
                System.out.print("목요일");
                break;
            case Calendar.FRIDAY:
                System.out.print("금요일");
                break;
            case Calendar.SATURDAY:
                System.out.print("토요일");
                break;
            default:
                break;
        }
        System.out.print("("+hourOfDay+"시)");
        if(AmPm == Calendar.AM)
        {
            System.out.print("오전");
        }
        else
        {
            System.out.print("오후");
        }
        System.out.println(Hour+"시 "+Minute+"분 "+Second+"초 "+MilliSecond+"밀리초");
    }

    public static void main(String [] args)
    {
        Calendar now = Calendar.getInstance();
        PrintCalendar("현재",now);

        Calendar FirstDate = Calendar.getInstance();
        FirstDate.clear();

        FirstDate.set(2016,11,25);
        FirstDate.set(Calendar.HOUR_OF_DAY,20);
        FirstDate.set(Calendar.MINUTE,30);
        PrintCalendar("처음 데이트한 날은",FirstDate);
    }
}
