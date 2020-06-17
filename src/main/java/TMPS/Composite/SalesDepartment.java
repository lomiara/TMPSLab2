package TMPS.Composite;

public class SalesDepartment implements Department {
    private Integer id;
    private String name;

    @Override
    public void printName() {
        System.out.println(getClass().getSimpleName());
    }

    public SalesDepartment(int id, String name) {
        this.id = id;
        this.name = name;
    }

}
