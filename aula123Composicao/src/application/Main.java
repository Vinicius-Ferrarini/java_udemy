package application;

import Entity.Department;
import Entity.HourContract;
import Entity.Worker;
import Entity.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName =  sc.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = sc.nextDouble();

        Worker worker = new Worker(new Department(departmentName), baseSalary , WorkerLevel.valueOf(workerLevel) ,workerName);
        System.out.print("Quantos contratos? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter contrato %d data:\n",i);
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Valor hora: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duracao: ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valuePerHour,hours);
            worker.addContract(contract);
        }

        System.out.print("Digite mes e ano(MM/YYYY): ");
        String monthAndYear = sc.next();

        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year  = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name "+ worker.getName());
        System.out.println("Departamento "+ worker.getDepartment().getName());
        System.out.println("ganhos "+ monthAndYear + " : " + String.format("%.2f",worker.income(year,month)));


        sc.close();
    }
}