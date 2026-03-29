import java.util.*;
import java.lang.Math;

class BookMyBus {
    Scanner sc = new Scanner(System.in);
    String P_Name;
    int B_id;
    boolean status;
    int[] AvailableSeat = new int[10];
    String[] Pname = new String[10];
    int[] id = new int[10];

    BookMyBus(String name, int B_id, boolean status) {
        this.P_Name = name;
        this.B_id = B_id;
        this.status = status;
    }

    int seat = 1;

    void Checkseat() {
        for (int i = 0; i < AvailableSeat.length; i++) {
            if (AvailableSeat[i] == 0) {
                System.out.println("Seat available");
                break;
            } else {
                System.out.println("Sorry Seat not available");
                seat = 0;
            }
        }
    }

    void BookSeat() {
        for (int i = 0; i < 1; i++) {
            if (AvailableSeat[i]== 0) {
                System.out.println("enter Passanger name : ");
                sc.nextLine();
                this.P_Name = sc.nextLine();
                this.B_id = (int) (Math.random() * 100) + 1;
                Pname[i] = P_Name;
                id[i] = B_id;
                AvailableSeat[i] = 1;
                System.out.println("Booking confirm");
            } 
        }

    }

    void viewBooking() {
        for (int j = 0; j < 9; j++) {
            if (AvailableSeat[j] == 1) {
                System.out.println("Passanger Name :" + Pname[j]);
                System.out.println("Booking Id : " + id[j]);
            } else {
                System.out.println("seat not found");
                break;
            }
        }

    }

     void CancelBooking(){
            System.out.println("Enter booking id");
            int userbokid=sc.nextInt();
            for(int k=0; k<9; k++ ){
                if(userbokid==id[k]){
                    Pname[k]=null;
                    id[k]=0;
                    AvailableSeat[k]=0;
                   System.out.println("Booking cancel successful");
                }else{
                    System.out.println("Booking id not found");
                    break;
                }
            }
        }
}

public class Assignment6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookMyBus b1 = new BookMyBus(null, 0, false);
        boolean flag = true;
        while (flag) {
            System.out.println("1.  View Available Seats\n" +
                    "2.  Book a Seat\n" +
                    "3.  View Booking \n"+
                "4. cancel booking\n"+
            "5. Exit");
            int userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    b1.Checkseat();
                    break;
                case 2 :
                    b1.BookSeat();
                    break;
                case 3:
                    b1.viewBooking();
                    break;
                case 4:
                    b1.CancelBooking();
                    break;    
                case 5:
                    flag=false;    
            }

        }

    }
}
