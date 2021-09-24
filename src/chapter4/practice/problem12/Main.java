package chapter4.practice.problem12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void ShowMenu_And_CreateSeat()
    {
        Seat S_Seat = new Seat("S");
        Seat A_Seat = new Seat("A");
        Seat B_Seat = new Seat("B");


        System.out.println("명품콘서트홀 예약 시스템입니다.\n");
        Scanner scanner = new Scanner(System.in);

        while(true)
        {
            System.out.print("예약 : 1, 조회 : 2, 취소 : 3, 끝내기 : 4 >> ");
            try
            {
                int Selection = scanner.nextInt();

                if(Selection == 1)
                {
                    System.out.print("좌석구분 S(1), A(2), B(3) >> ");
                    try
                    {
                        int SeatSection = scanner.nextInt();
                        if(SeatSection == 1)
                        {
                            S_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();

                            System.out.print("번호 >> ");
                            try
                            {
                                int SeatNumber = scanner.nextInt();
                                S_Seat.AddPerson(PersonName,SeatNumber-1);
                            }
                            catch (InputMismatchException e)
                            {
                                System.out.println("숫자(1 ~ 10)만을 입력해주세요.\n\n");
                                scanner.next();
                            }
                        }
                        else if(SeatSection == 2)
                        {
                            A_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();

                            System.out.print("번호 >> ");
                            try
                            {
                                int SeatNumber = scanner.nextInt();
                                A_Seat.AddPerson(PersonName,SeatNumber-1);
                            }
                            catch (InputMismatchException e)
                            {
                                System.out.println("숫자(1 ~ 10)만을 입력해주세요.\n\n");
                                scanner.next();
                            }
                        }
                        else if(SeatSection == 3)
                        {
                            B_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();

                            System.out.print("번호 >> ");
                            try
                            {
                                int SeatNumber = scanner.nextInt();
                                B_Seat.AddPerson(PersonName,SeatNumber-1);
                            }
                            catch (InputMismatchException e)
                            {
                                System.out.println("숫자(1 ~ 10)만을 입력해주세요.\n\n");
                                scanner.next();
                            }
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("숫자(1 ~ 3)만을 입력해주세요.\n\n");
                        scanner.next();
                    }
                }
                else if(Selection == 2)
                {
                    S_Seat.ShowSeatState();
                    A_Seat.ShowSeatState();
                    B_Seat.ShowSeatState();
                    System.out.println("<<<조회를 완료하였습니다.>>>\n\n");
                }
                else if(Selection == 3)
                {
                    System.out.print("좌석 S : 1, A : 2, B : 3 >> ");
                    try
                    {
                        int SeatSection = scanner.nextInt();
                        if(SeatSection == 1)
                        {
                            S_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();
                            S_Seat.CancelReservation(PersonName);
                        }
                        else if(SeatSection == 2)
                        {
                            A_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();
                            A_Seat.CancelReservation(PersonName);
                        }
                        else if(SeatSection == 3)
                        {
                            B_Seat.ShowSeatState();
                            System.out.print("이름 >> ");
                            String PersonName = scanner.next();
                            B_Seat.CancelReservation(PersonName);
                        }
                        else
                        {
                            System.out.println("1 ~ 3사이의 숫자만 입력해주세요.\n\n");
                        }
                    }
                    catch (InputMismatchException e)
                    {
                        System.out.println("숫자(1 ~ 3)만을 입력해주세요.\n\n");
                        scanner.next();
                    }
                }
                else if(Selection == 4)
                {
                    System.out.println("시스템을 종료합니다.\n\n");
                    break;
                }
                else
                {
                    System.out.println("1 ~ 4사이의 숫자만 입력해주세요.\n\n");
                }
            }
            catch (InputMismatchException e)
            {
                System.out.println("숫자(1 ~ 4)만을 입력해주세요.\n\n");
                scanner.next();
            }
        }
        scanner.close();
    }

    public static void main(String [] args)
    {
        ShowMenu_And_CreateSeat();
    }
}
