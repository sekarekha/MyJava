package practice;

public class Employee {
    public static void main(String args[]) {
        int empId;
        //boolean employee=true;
        String employee = "Jashwanth";
        String[] name = {"Ayyappa", "RakeshKrishna", "Venkat", "Jashwanth", "Rekha"};
        String[] designation = {"Java Developer", "Scrum Master", "Team Lead", "Trainee", "Junior Developer"};
        int[] salary = {30000, 25000, 40000, 5000, 5000};
        for (int i = 0; i <= name.length - 1; i++) {
            if ((name[i].equals(employee))) {
                System.out.println(" Name :" + name[i] + "\n" + " Designation :" + designation[i] + "\n" + " Salary :" + salary[i]);
            }
        }
        }
    }



