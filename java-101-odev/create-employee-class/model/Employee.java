package com.huseyinuslu.java101.model;

public class Employee {

    private final String nameAndSurname;
    private int salary;
    private boolean isTakenTax;
    private int tax = 0;
    private boolean isGivenBonusSalary;
    private int extraSalaryForBonusWork = 0;
    private int extraSalaryForExperience = 0;
    final int workHours;
    final int hireYear;

    public Employee(
            String nameAndSurname,
            int salary,
            int workHours,
            int hireYear
    ){
        this.nameAndSurname = nameAndSurname;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        tax();
        bonus();
        raiseSalary();
    }

    private void tax(){
        if(salary >= 1000) //not taken any taxes from the salary if the salary is under 1000//
        {
            tax = (salary / 100) * 3;
            isTakenTax = true;
        }else{
            isTakenTax = false;
        }
    }

    private void bonus(){
        if(workHours > 40){
            extraSalaryForBonusWork = (workHours - 40) * 30;
            isGivenBonusSalary = true;
        }else{
            isGivenBonusSalary = false;
        }
    }

    private void raiseSalary(){
        if(2021 - hireYear < 10){
            extraSalaryForExperience = (salary * 5) / 100;
        }else if(2021 - hireYear >= 10 && 2021 - hireYear < 20){
            extraSalaryForExperience = (salary * 10) / 100;
        }else if(2021 - hireYear >= 20){
            extraSalaryForExperience = (salary * 15) / 100;
        }
    }

    public void printInfo(){
        String info = "_________________________________" + "\n" +
                "name: " + this.nameAndSurname + "\n" +
                        "main salary: " + String.valueOf(salary) + "\n" +
                        (isTakenTax ? "tax: " + String.valueOf(tax) + "\n" : "") +
                        (isGivenBonusSalary ? "extra salary for overtime: " + extraSalaryForBonusWork + "\n" : "") +
                        "extra salary for experience: " + extraSalaryForExperience + "\n" +
                "total salary: " + (salary - tax + extraSalaryForExperience + extraSalaryForExperience);
        System.out.println(info);
    }
}
