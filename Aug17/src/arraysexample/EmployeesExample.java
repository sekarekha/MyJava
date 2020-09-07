package arraysexample;

public class EmployeesExample {
    public static void main(String args[]) {
        String[] employeeName = {"Sekhar", "MuthuReddy", "Natrajan", "SubramanyamReddy", "Chandra", "Pavan"};
        int employeeAge = 24;
        String[] designation = {"DivisionEngineer", "AssistantEngineer", "LineInspector", "SubEngineer"};
        double salary = 0;
        int employeeCount;
        for (employeeAge = 15; employeeAge <= 65; employeeAge++) {
            if (employeeAge >= 50) {
                System.out.println("They are eligible for 'RetirementPensionPlan'.");
                System.out.println(employeeName[1] + " \n " + employeeAge + " \n " + designation[0] + "\n" + salary);

            } else if (employeeAge >= 30) {
                System.out.println("They are eligibe for 'CareGivingBenefits'.");
                System.out.println(employeeName[0] + " \n " + employeeAge + " \n " + designation[1] + "\n" + salary);

            } else if (employeeAge >= 20) {
                System.out.println("They are eligible for 'RegularBenefits'.");
                System.out.println(employeeName[4] + " \n " + employeeAge + " \n " + designation[3] + "\n" + salary);

            } else {
                System.out.println("Below 20 ages not eligible for benefits.");

            }
        }

    }
}
