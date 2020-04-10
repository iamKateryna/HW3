public class Employee {

    private String name;
    private double rate;
    private double hours;
    static double totalSum;

    public void setName(String Name ) {this.name = Name; }
    public void setRate(double Rate) {this.rate = Rate; }
    public void setHours(double Hours) {this.hours = Hours; }
    public static void setTotalSum(double TotalSum) {Employee.totalSum = TotalSum; }

    public String getName() {return this.name; }
    public double getRate() {return this.rate; }
    public double getHours() {return this.hours; }
    public double getTotalSum() {return Employee.totalSum; }

    public Employee() {}
    public Employee(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public  Employee(String name, double rate, double hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    double getSalary() {
        return (rate*hours);
    }

    @Override
    public String toString() {
        return "Employee [Name:" +name+", rate:" +rate+", hours:"+hours+", Salary: " +getSalary()+ "]";
    }

    void changeRate(double Rate){
        setRate(Rate);
    }

    double getBonuses() {
        double bon = getSalary() * 0.1;
        return  bon;
    }
}

