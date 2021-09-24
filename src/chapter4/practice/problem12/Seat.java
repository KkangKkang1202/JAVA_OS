package chapter4.practice.problem12;

public class Seat
{
    private String SeatName;
    private String [] Seats;

    public Seat(String SeatName)
    {
        this.SeatName = SeatName;
        this.Seats = new String[10];
        for(int Index=0; Index<Seats.length; Index++)
        {
            Seats[Index] = "---";
        }
    }

    public void AddPerson(String PersonName, int SeatNumber)
    {
        if(SeatNumber >= Seats.length || SeatNumber <=0)
        {
            System.out.println("없는 좌석 번호입니다.\n\n");
        }
        else
        {
            Seats[SeatNumber] = PersonName;
            System.out.println("예약이 완료되었습니다.\n\n");
        }
    }

    public void CancelReservation(String PersonName)
    {
        for(int Index=0; Index<Seats.length; Index++)
        {
            if(Seats[Index].equals(PersonName))
            {
                Seats[Index] = "---";
            }
        }
        System.out.println("예약이 취소되었습니다.\n\n");
    }

    public void ShowSeatState()
    {
        System.out.print(this.SeatName+" >> ");
        for(String Seat : Seats)
        {
            System.out.print(Seat+" ");
        }
        System.out.println();
    }
}
