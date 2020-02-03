public class Main {
    public static  void main(String [] args){
        Employee e1 = new Employee(); // Create Object
        e1.setId("1");
        e1.setName("Chaiwat");
        e1.setSalary(25000.0);

        System.out.println(""+e1.getName());
        System.out.println(""+e1.getSalary());

        Employee e2 = new Employee(); // Create Object
        e2.setId("2");
        e2.setName("Kanita");
        e2.setSalary(18000.0);

        System.out.println(""+e2.getName());
        System.out.println(""+e2.getSalary());

    }
}
