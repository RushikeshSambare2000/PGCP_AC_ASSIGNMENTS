import java.util.*;

class BillGenerator {
    Scanner sc = new Scanner(System.in);
    String Item_name;
    int Item_Qty;
    double Item_cost;
    String[] Total_names=new String[5];
    int[] Total_Item_Qty = new int[5];
    double[] Total_Cost = new double[5];
    int i = 0;

    public void EnterItemDetails() {
        boolean flag = true;

        while (flag) {
            System.out.println("Enter 1 for add item, and 0 for ptint bill");
            int userchoise=sc.nextInt();
            switch (userchoise) {
                case 1:
                    System.out.println("enter details for item no " + i+1);
                    System.out.println("enter the item name :");
                    sc.nextLine();
                    Total_names[i]=sc.nextLine();
                    System.out.println("enter Item qty :");
                    Total_Item_Qty[i]=sc.nextInt();
                    System.out.println("enter Item Cost :");
                    Total_Cost[i]=sc.nextDouble();
                    sc.nextLine();
                    i++;
                    break;
                case 0:
                    System.out.println("thanks..");
                    flag=false;
                    break;
            }

        }

        }

        void printbill(){
            for(int j=0; j<i; j++){
                System.out.println(Total_names[j] +" : "+Total_Item_Qty[j]+" : "+ Total_Cost[j]);
            }
            double totalbill=0;
            for(int k=0; k<i; k++){
                totalbill=totalbill+Total_Cost[k];
            }
            if(totalbill>3000){
                double discount =totalbill*10/100;
                System.out.println("Total Discount  (10%) : "+discount);
                System.out.println("Total Bill : "+(totalbill-discount));
            }else{
                System.out.println("Total Bill : "+totalbill);
            }
     
        }

    }


public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BillGenerator b1= new BillGenerator();
        b1.EnterItemDetails();
        System.out.println("***************************");
        b1.printbill();
        System.out.println("***************************");
    }
}
