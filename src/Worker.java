import java.text.DecimalFormat;

public class Worker extends Person
{
    double hourlyPayRate = 8;
    double shift = 40;

    DecimalFormat numberFormat = new DecimalFormat("#.000");

    public DecimalFormat getNumberFormat()
    {
        return numberFormat;
    }

    public Worker(String firstName, String lastName, String ID, String title, int yob)
    {
        super(firstName, lastName,ID, title, yob);
    }
    public double calculateWeeklyPay(double hoursWorked)
    {
        double weeklyPay = hoursWorked * hourlyPayRate;
        if(hoursWorked < shift)
        {
            return Double.parseDouble((numberFormat.format(weeklyPay)));
        }
        else
        {
            double overtime = hoursWorked -shift;
            return Double.parseDouble((numberFormat.format((weeklyPay + (overtime *hourlyPayRate * .5)))));
        }
    }
    public String displayWeeklyPay(double hoursWorked)
    {
        if(hoursWorked <= shift) {
            return /*"Hours worked of regular pay: " + hoursWorked + " Weekly pay: $" + */""+Double.parseDouble((numberFormat.format(calculateWeeklyPay(hoursWorked))));
        }
        else{
            double hoursOver = hoursWorked -shift;
            double normPay = calculateWeeklyPay(hoursWorked);
            double overPay = (calculateWeeklyPay(hoursWorked) - (hourlyPayRate * shift));
            double total = normPay + overPay;
            return /*"Hours worked of regular pay: " + shift + " Weekly pay: $" + calculateWeeklyPay(shift)+
                    "\nHours worked of overtime pay: "+hoursOver+ " Overtime pay: $"+ overPay+
                    "\nTotal: $"+total;*/
           ""+ Double.parseDouble((numberFormat.format(total)));
        }
    }
    public void setNumberFormat(DecimalFormat numberFormat) {
        this.numberFormat = numberFormat;
    }
    public double getHourlyPayRate() {
        return Double.parseDouble((numberFormat.format(hourlyPayRate)));
    }

    public void setHourlyPayRate(double hourlyPayRate) {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double getShift() {
        return shift;
    }

    public void setShift(double shift) {
        this.shift = shift;
    }
}
