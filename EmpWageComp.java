class EmpWageComp{
    public static void main(String [] args)
    {
        


        System.out.println("===== WELCOME TO EMPLOYEE WAGE COMPUTATION ======");

        int empCheck = (int) Math.floor(Math.random() * 10) % 2;
        if(empCheck == 0)
        {
            System.out.println("Employee is Present");
        }
        else
        {
            System.out.println("Employee is Absent");
        }

    }
}
