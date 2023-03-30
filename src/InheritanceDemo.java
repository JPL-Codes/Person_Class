import java.util.ArrayList;
public class InheritanceDemo{
public static void main(String[] args) {

    ArrayList<Worker> wList = new ArrayList<>();
    Worker Tom = new Worker("Tom", "Wulf", "000001", "Prof", 1960);
    Worker Ben = new Worker("Ben", "Smith", "000007", "Sr.", 1998);
    Worker Runt = new Worker("Runt", "Small", "000004", "", 1990);
    SalaryWorker Chad = new SalaryWorker("Chad", "Money", "000006", "Dr.", 1998);
    SalaryWorker Brad = new SalaryWorker("Brad", "Wall", "000009", "Jr.", 1999);
    SalaryWorker Ezekiel = new SalaryWorker("Ezekiel", "Fritz", "000003", "Mr.", 1986);

    wList.add(Tom);
    wList.add(Ben);
    wList.add(Runt);
    wList.add(Chad);
    wList.add(Brad);
    wList.add(Ezekiel);


    Tom.setHourlyPayRate(16);
    Ben.setHourlyPayRate(18);
    Runt.setHourlyPayRate(20);

    Chad.setAnnualSalary(72000);
    Brad.setAnnualSalary(80000);
    Ezekiel.setAnnualSalary(100000);

    int w1 = 40;
    int w2 = 50;
    int w3 = 40;

    //week 1
    for (int i = 0; i < wList.size(); i++) {
        System.out.print(wList.get(i).getFirstName() + ": " + wList.get(i).displayWeeklyPay(w1) + "\r\n");

    }
    //week 2
    System.out.println("\n");
    for (int i = 0; i < wList.size(); i++)
    {
        System.out.print(wList.get(i).getFirstName() + ": " + wList.get(i).displayWeeklyPay(w2) + "\r\n");
    }
    //week 3
    System.out.println("\n");
    for (int i = 0; i < wList.size(); i++)
    {
        System.out.print(wList.get(i).getFirstName() +": "+ wList.get(i).displayWeeklyPay(w3)+"\r\n");

    }
    /*
    System.out.println("\n");
    System.out.println("Weekly Pay: $" +Runt.calculateWeeklyPay(30));
    System.out.println(Runt.displayWeeklyPay(30));
    System.out.println("Weekly Pay: $" +Ben.calculateWeeklyPay(30));
    System.out.println(Ben.displayWeeklyPay(30));
    System.out.println(Chad.displayWeeklyPay(0));
*/
    System.out.printf("---------------------------------------------------------------------------%n");
    System.out.printf("                                  Weekly                                   %n");
    System.out.printf("                                    Pay                                    %n");
    System.out.printf("---------------------------------------------------------------------------%n");
    System.out.printf("| %-14s | %-6s | %-9s | %-9s | %-9s | %-9s |%n", "NAME" , "ID","WEEK 1","WEEK 2","WEEK 3","TOTAL");
    System.out.printf("---------------------------------------------------------------------------%n");

    for (int i = 0; i < wList.size(); i++)
    {
        double tots = wList.get(i).calculateWeeklyPay(w1)+wList.get(i).calculateWeeklyPay(w2)+wList.get(i).calculateWeeklyPay(w3);

        System.out.printf("| %-14s | %-6s | %-9s | %-9s | %-9s | %-9s |%n",wList.get(i).getFullName(), wList.get(i).getID(),
                "$ " + wList.get(i).displayWeeklyPay(w1),
                "$ " + wList.get(i).displayWeeklyPay(w2),
                "$ " + wList.get(i).displayWeeklyPay(w3),
                "$ "+ tots);
    }

    //System.out.printf("| %-10s | %-6s | %-6s | %-7s | %-6s |%n", Tom.getFullName(), Tom.getID(),"$"+ Tom.displayWeeklyPay(40),"$"+ Tom.displayWeeklyPay(50),"$"+ Tom.displayWeeklyPay(40));
    System.out.printf("---------------------------------------------------------------------------%n");
}

}


