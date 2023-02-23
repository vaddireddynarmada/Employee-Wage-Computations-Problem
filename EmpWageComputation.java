public class EmpWageComputation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int workingDay = 20;
        int totalWage = 0;

        for (int i=1;i<=workingDay;i++) {
            int attendance = (int) (Math.random() * 100) % 3;
            int workingHour = 0;
            switch (attendance) {
                case 0:
                    workingHour = 8;
                    System.out.println("employee worked for full time");
                    break;

                case 1:
                    workingHour = 4;
                    System.out.println("employee worked for part time");
                    break;

                default:
                    System.out.println("employee is Absent");

            }
            int wage = wagePerHour * workingHour;
            System.out.println("Employee daily wage: " + wage + " Rupees.");
            totalWage = wage + totalWage;
        }
        System.out.println("Employee monthly wage: " + totalWage + " Rupees.");
    }
}