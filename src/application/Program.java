package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");

        int n = sc.nextInt();
        for (int i=1; i<=n; i++) {
            System.out.println("Employee #" + i + " data:");

            System.out.print("Outsourced (y/n)? ");
            char outsourced = sc.next().charAt(0);
            if (outsourced == 'n') {
                String name = sc.nextLine();
                int hours = sc.nextInt();
                double valuePerHour = sc.nextDouble();

                Employee employee = new Employee(name, hours, valuePerHour);
                employees.add(employee);
            }
        }


        sc.close();
    }

}
