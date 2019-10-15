package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, double percent) { //amount - сумма выданная по кредиту, salary-доход,percent - процентная ставка
        int year = 0;
        double debt=amount;
        double percentage;
        while(debt>0){
            percentage=((debt*percent)/100);
            debt+=percentage;
            debt-=salary;
            year++;
        }
        return year;
    }
}