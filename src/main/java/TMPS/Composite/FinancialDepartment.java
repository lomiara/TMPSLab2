package TMPS.Composite;

public class FinancialDepartment implements Department {
    private Integer id;
    private String name;

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

    public FinancialDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
