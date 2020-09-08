//Script of final challenge of software developer bootcamp
//Created in 2020-09-07 by Aline Guerreiro

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Integer;

public class PaymentControl {
    private Scanner scanner = new Scanner(System.in);

    private String showMenu(){
        StringBuilder sb = new StringBuilder();
        sb.append("Enter the command: \n");
        sb.append("1 - Add a new co-worker \n");
        sb.append("2 - Print paycheck \n");
        sb.append("0 - Exit \n");

        System.out.println(sb.toString());
        return scanner.nextLine();
    }

    private Double computeINSSFee(Double salary){
        Double inssFee = 0.0;

        if (salary > 6101.06) {
            inssFee = 713.10;
        } 
        else if (salary <= 1045){
            inssFee = salary*0.075;
        }
        else if (salary > 1045.01 && salary <= 2089.6){
            inssFee = (1045*0.075) + (salary-1045.01)*0.09;
        }
        else if (salary > 2089.61 && salary <= 3134.4){
            inssFee = (1045*0.075) + (2089.6-1045.01)*0.09 + (salary-2089.61)*0.12;
        }
        else if (salary > 3134.41 && salary <= 6101.06){
            inssFee = (1045*0.075) + (2089.6-1045.01)*0.09 + (3134.4-2089.61)*0.12 + (salary-3134.4)*0.14;
        }
        
        return inssFee;
    }

    private Double computeIRRFFee(Double salary,Double inssFee){
        Double irrfFee = 0.0;
        Double salaryWithoutInss = salary - inssFee;

        if (salaryWithoutInss > 1903.99 && salaryWithoutInss <= 2826.65){
            irrfFee = (salaryWithoutInss*0.075) - 142.8;
        }
        else if (salaryWithoutInss > 2826.66 && salaryWithoutInss <= 3751.05){
            irrfFee = (salaryWithoutInss*0.15) - 354.8;
        }
        else if (salaryWithoutInss > 3751.06 && salaryWithoutInss <= 4664.68){
            irrfFee = (salaryWithoutInss*0.225) - 636.13;
        }
        else if (salaryWithoutInss > 4664.69){
            irrfFee = (salaryWithoutInss*0.275) - 869.36;
        }

        return irrfFee;
    }

    public Integer findIndexEmployee(String nameEmployee,  ArrayList<EmployeeClass> employees){
        for(Integer i=0; i<=employees.size()-1; i++){
            if (employees.get(i).getName().equals(nameEmployee)) {
                return i;
            }
        }
        return -1;
    }

    public void start(){
        ArrayList<EmployeeClass> employees = new ArrayList<>();        
        String option = showMenu();

        while (!option.equals("0")){
            switch (option){
                case "1":
                    System.out.println("Enter the name of employee to add in list:");
                    EmployeeClass employee = new EmployeeClass();
                    String item = scanner.nextLine();
                    employee.setName(item);
                    System.out.println("Enter the brute salary of this employee:");
                    String bruteSalary = scanner.nextLine();
                    employee.setBruteSalary(Double.parseDouble(bruteSalary));
                    employees.add(employee);
                    option = showMenu();
                    break;
                case "2":
                    System.out.println("Enter the employee's name to print paycheck: ");
                    String employeeName = scanner.nextLine();
                    Integer indexEmployee = findIndexEmployee(employeeName, employees);
                    if (indexEmployee != -1){
                        System.out.println("Employee found... ");
                        System.out.println("Computing paycheck...");
                        EmployeeClass selectedEmployee = employees.get(indexEmployee);
                        Double computeInss = computeINSSFee(selectedEmployee.getBruteSalary());
                        selectedEmployee.setInssFee(computeInss);
                        Double computeIrff = computeIRRFFee(selectedEmployee.getBruteSalary(),selectedEmployee.getInssFee());
                        selectedEmployee.setIrrfFee(computeIrff);
                        Double liquidSalary = selectedEmployee.getBruteSalary() -  selectedEmployee.getInssFee() -  selectedEmployee.getIrrfFee();
                        selectedEmployee.setLiquidSalary(liquidSalary);
                        System.out.println("Employee: "+ selectedEmployee.getName() + "\n"
                                         + "Brute Salary: "+ selectedEmployee.getBruteSalary() + "\n"
                                         + "INSS: "+ selectedEmployee.getInssFee() + "\n"
                                         + "IRFF: "+ selectedEmployee.getIrrfFee() + "\n"
                                         + "Liquid Salary: "+ selectedEmployee.getLiquidSalary() + "\n");
                        option = showMenu();
                        break;
                    }
                    else {
                        System.out.println("Invalid name... Try again");
                        option = showMenu();
                        break;
                    }                    
                default:
                    System.out.println("Invalid Option.");
                    option = showMenu();
            }
        }
        scanner.close();
        System.out.println("Thanks to use our program :) ");
    }
   
}
