package TMPS.Composite;

public class Client {

    public void example(){
        System.out.println("Composite");
        Department salesDepartment = new SalesDepartment(
                1, "Sales department");
        Department financialDepartment = new FinancialDepartment(
                2, "Financial department");

        Composite headDepartment = new Composite(
                3, "Head department");

        headDepartment.addDepartment(salesDepartment);
        headDepartment.addDepartment(financialDepartment);

        headDepartment.printName();
        System.out.print('\n');
    }
}
