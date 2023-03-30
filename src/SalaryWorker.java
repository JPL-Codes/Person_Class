import java.text.DecimalFormat;

public class SalaryWorker extends Worker {
    public SalaryWorker(String firstName, String lastName, String ID, String title, int yob)
    {
        super(firstName, lastName,ID, title, yob);
    }
    double annualSalary = 0;
    DecimalFormat numberFormat = new DecimalFormat("#.00");
//System.out.println(numberFormat.format(number));

    public DecimalFormat getNumberFormat() {
        return numberFormat;
    }

    public void setNumberFormat(DecimalFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        return Double.parseDouble((numberFormat.format(annualSalary / 52)));
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        return /*"Weekly pay of salary: $"+*/""+calculateWeeklyPay(hoursWorked);
       // return super.displayWeeklyPay(hoursWorked);
    }
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double anualSalary) {
        this.annualSalary = anualSalary;
    }
}
