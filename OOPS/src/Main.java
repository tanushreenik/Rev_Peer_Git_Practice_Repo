/*public class Main{
    public static void main(String[] args){
        account bankaccount=new account();
        bankaccount.accountnumber=12204038;
        bankaccount.customername="Tanu";
        bankaccount.balance=200000;
        bankaccount.displayaccountinfo();



    }

}*/



public class Main{
    public static void main(String[] args) {

        Employee e = new Employee(101, "Tanu", 20000, 5000, 10);
        e.displaySalarySlip();
        e.setBasicSalary(25000);
        e.setTaxPercentage(15);
        e.displaySalarySlip();
    }
}