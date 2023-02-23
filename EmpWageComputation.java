public class EmpWageComputation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int workingDay = 20;
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
                System.out.println("Absent");

        }
        int wage = (wagePerHour * workingHour) * workingDay;
        System.out.println("Employee Monthly wage: " + wage + " Rupees.");

    }
}