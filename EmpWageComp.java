
import java.util.Scanner;





class EmployeeWageComputation {
    int wagePerHour;
    int fullDay;
    int halfDay;
    int dailyWage;
    int monthlyWage;
    float counter1;
    int totalHourPresnt;
    int totalhourPartTime;
    int totalHourAbsent;
    int empCheck;
    int totalHours;
     int totalNoOfDays;

    String companyName;

    EmployeeWageComputation( String companyName1,int wage,int totalNoOfDays) {

         this.wagePerHour = wage;
         this.fullDay = 8;
        this.halfDay = 4;
        this.dailyWage = 0;
        this.monthlyWage = 0;
        this.counter1 = 0.0f;
        this.totalHourPresnt = 0;
        this.totalhourPartTime = 0;
        this.totalHourAbsent = 0;
        this.totalHours = 0;
        this.companyName = companyName1;
        this.totalNoOfDays = totalNoOfDays;






    }


    public  void attendanceCheck() {

        this.empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (this.empCheck) {
            case 0:

                System.out.println(companyName + ":" + " Employee is Present  and is working full time ");
                this.totalHourPresnt = this.totalHourPresnt + 8;
                this.counter1 = counter1 + 1.0f;
                break;

            case 1:
                System.out.println(companyName + ":" + "Employee is Present but working part time");
                this.totalhourPartTime = this.totalhourPartTime + 4;
                this.counter1 = counter1 + 0.5f;
                break;

            case 2:
                System.out.println(companyName + ":" + "Employee is Absent");
                this.totalHourAbsent = 0;
                this.counter1 = counter1 + 0f;
                break;
        }
    }

    public  void dailyWage() {
        if (empCheck == 0) {
            dailyWage = wagePerHour * fullDay;
            System.out.println(companyName + ":" +"The daily wage of Employee is : " + dailyWage);

        } else if (empCheck == 1) {
            dailyWage = wagePerHour * halfDay;
            System.out.println(companyName + ":" +"The daily wage of Employee is : " + dailyWage);

        } else {
            dailyWage = 0;
            System.out.println(companyName + ":" +"The daily wage of Employee is : " + dailyWage);

        }
        //  System.out.println(totalHours);

    }

    public  void monthlyWage() {

        monthlyWage = monthlyWage + dailyWage;
        totalHours = totalHourPresnt + totalhourPartTime;

    }


    public  void monthlyWageCondition() {

        if (counter1 >= 20 || totalHours >= 100) {
            System.out.println(companyName + ":" +"Total working hour while employee is working Full time :" + totalHourPresnt);
            System.out.println(companyName + ":" +"Total working hour while employee is working Part time :" + totalhourPartTime);
            System.out.println(companyName + ":" +"Total working hour while employee is Absent :" + totalHourAbsent);
            System.out.println(companyName + ":" +"The monthly wage is: " + monthlyWage);
        } else {
            System.out.println(companyName + ":" +"Total working hour while employee is working Full time :" + totalHourPresnt);
            System.out.println(companyName + ":" +"Total working hour while employee is working Part time :" + totalhourPartTime);
            System.out.println(companyName + ":" +"The total hours employee worked is: " + totalHours);
            System.out.println(companyName + ":" +"The monthly wage is: " + monthlyWage);
        }
    }


    void combineMethod() {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter the number of days you were supposed to work ( between 1 -20 ) for: ");
        totalNoOfDays = sc1.nextInt();

        for (int i = 1; i <= totalNoOfDays; i++) {
            System.out.println("DAY NO :" + i);
            attendanceCheck();
            dailyWage();
            monthlyWage();
        }
            monthlyWageCondition();

    }
}



public class EmpWageComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        EmployeeWageComputation TataMotors = new EmployeeWageComputation("Tata Motors", 20, 5);
        EmployeeWageComputation Bridgelabz = new EmployeeWageComputation("Bridelabz", 16, 6);
        EmployeeWageComputation SamSolutions = new EmployeeWageComputation("Sam Solutions", 25, 3);
        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
        System.out.println("");
        char userChoice = 'Y' ;
        while (userChoice == 'Y') {
        System.out.println("Enter your choice 1:Tata Motors 2:Bridelabz  3:Sam Sultions : ");
        int choice = sc.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("COMPANY NAME :" + TataMotors.companyName);
                    TataMotors.combineMethod();
                    System.out.println("\n");
                }
                case 2 -> {
                    System.out.println("COMPANY NAME :" + Bridgelabz.companyName);
                    Bridgelabz.combineMethod();
                    System.out.println("\n");

                }
                case 3 -> {
                    System.out.println("COMPANY NAME :" + SamSolutions.companyName);
                    SamSolutions.combineMethod();
                    System.out.println("\n");
                }
                default -> System.out.println("Not a valid choice");
            }
            System.out.println("Do you wish to check any other comapny details : if yes press 'Y' or else 'N' :");
            userChoice = sc.next().charAt(0);


        }
        System.out.println("Thank you for using the service");
    }
}