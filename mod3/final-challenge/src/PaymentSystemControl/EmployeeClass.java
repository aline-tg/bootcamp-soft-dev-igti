//Script of final challenge of software developer bootcamp
//Created in 2020-09-07 by Aline Guerreiro

import java.lang.String;

public class EmployeeClass {
    private String name;
    private Double bruteSalary;
    private Double inssFee;
    private Double irrfFee;
    private Double liquidSalary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBruteSalary() {
        return bruteSalary;
    }

    public void setBruteSalary(Double bruteSalary) {
        this.bruteSalary = bruteSalary;
    }

    public Double getInssFee() {
        return inssFee;
    }

    public void setInssFee(Double inssFee) {
        this.inssFee = inssFee;
    }

    public Double getIrrfFee() {
        return irrfFee;
    }

    public void setIrrfFee(Double irrfFee) {
        this.irrfFee = irrfFee;
    }

    public Double getLiquidSalary() {
        return liquidSalary;
    }

    public void setLiquidSalary(Double liquidSalary) {
        this.liquidSalary = liquidSalary;
    }
}