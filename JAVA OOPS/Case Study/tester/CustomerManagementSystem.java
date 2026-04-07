package tester;

import java.util.Scanner;
import service.*;
import exception.CustomerException;

public class CustomerManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CustomerOperations ops = new CustomerOperationsImpl();

        while (true) {
            System.out.println("\n1.SignUp 2.SignIn 3.ChangePassword 4.Unsubscribe");
            System.out.println("5.DisplayAll 6.DeleteByPlan 7.SortByDob");
            System.out.println("8.SortByEmail 9.SortByPlanAndLastName 0.Exit");

            try {
                switch (sc.nextInt()) {

                    case 1:
                        ops.signUp(sc.next(), sc.next(), sc.next(),
                                sc.next(), sc.nextDouble(), sc.next(), sc.next());
                        break;

                    case 2:
                        ops.signIn(sc.next(), sc.next());
                        break;

                    case 3:
                        ops.changePassword(sc.next(), sc.next(), sc.next());
                        break;

                    case 4:
                        ops.unsubscribe(sc.next());
                        break;

                    case 5:
                        ops.displayAll();
                        break;

                    case 6:
                        ops.deleteByPlan(sc.next());
                        break;

                    case 7:
                        ops.sortByDob();
                        break;

                    case 8:
                        ops.sortByEmail();
                        break;

                    case 9:
                        ops.sortByPlanAndLastName();
                        break;

                    case 0:
                        System.exit(0);
                }
            } catch (CustomerException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}