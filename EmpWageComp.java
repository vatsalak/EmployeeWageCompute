class EmpWageComp{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNoOfDays;
        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");
        System.out.println("");
        System.out.print("Enter the number of days you were supposed to work ( between 1 -20 ): ");
        totalNoOfDays = sc.nextInt();
        EmployeeWageComputation e1 = new EmployeeWageComputation();

        for (int i = 1; i <= totalNoOfDays; i++) {
            System.out.println("The day is :" + i);
            e1.attendanceCheck();
            e1.dailyWage();
            e1.monthlyWage();
        }

        e1.monthlyWageCondition();
    }

}
class EmployeeWageComputation {
    int wagePerHour;
    int fullDay;
    int halfDay;
    int dailyWage;
    int monthlyWage;
    int counter1;
    int totalHourPresnt;
    int totalhourPartTime;
    int totalHourAbsent;
    int empCheck;
    int totalHours;
    EmployeeWageComputation() {

        this.wagePerHour = 20;
        this.fullDay = 8;
        this.halfDay = 4;
        this.dailyWage = 0;
        this.monthlyWage = 0;
        this.counter1 = 0;
        this.totalHourPresnt = 0;
        this.totalhourPartTime = 0;
        this.totalHourAbsent = 0;
        this.totalHours = 0;

    }
    void attendanceCheck() {

        this.empCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (this.empCheck) {
            case 0:

                System.out.println("Employee is Present  and is working full time ");
                this.totalHourPresnt = this.totalHourPresnt + 8;
                break;

            case 1:
                System.out.println("Employee is Present but working part time");
                this.totalhourPartTime = this.totalhourPartTime + 4;
                break;

            case 2:
                System.out.println("Employee is Absent");
                this.totalHourAbsent = 0;
                break;
        }
    }

    void dailyWage() {
        if (empCheck == 0) {
            dailyWage = wagePerHour * fullDay;
            System.out.println("The daily wage of Employee is : " + dailyWage);
            System.out.println(" \n ");
        } else if (empCheck == 1) {
            dailyWage = wagePerHour * halfDay;
            System.out.println("The daily wage of Employee is : " + dailyWage);
            System.out.println(" \n ");
        } else {
            dailyWage = 0;
            System.out.println("The daily wage of Employee is : " + dailyWage);
            System.out.println(" \n ");
        }
        //  System.out.println(totalHours);

    }

    void monthlyWage() {

        monthlyWage = monthlyWage + dailyWage;
        totalHours = totalHourPresnt + totalhourPartTime ;

    }


    void monthlyWageCondition() {

        if (counter1 >= 20 || totalHours >= 100) {
            System.out.println("Total working hour while employee is working Full time :" + totalHourPresnt);
            System.out.println("Total working hour while employee is working Part time :" + totalhourPartTime);
            System.out.println("Total working hour while employee is Absent :" + totalHourAbsent);
            System.out.println("The monthly wage is: " + monthlyWage);
        } else {
            System.out.println("Total working hour while employee is working Full time :" + totalHourPresnt);
            System.out.println("Total working hour while employee is working Part time :" + totalhourPartTime);
            System.out.println("The total hours employee worked is: " + totalHours);
            System.out.println("The monthly wage is: " + monthlyWage);
        }
    }
}
