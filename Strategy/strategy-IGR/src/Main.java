import controller.EmployeeInventory;
import model.Employee;
import model.Pays;

/**
 * Created by Elimane on Apr, 2020, at 01:16
 */
public class Main {
    public static void main(String[] args) {
        //CONTEXT
        EmployeeInventory inventory = new EmployeeInventory();

        //DATA
        Employee emp1 = new Employee("Kouassi", "Eric", "A123E", 7_000_000, Pays.CI);

        Employee emp2 = new Employee("Yassin", "Sofian", "A123E", 60000, Pays.MOROCCO);

        Employee emp3 = new Employee("Yazid", "Jamel", "A123E", 90000, Pays.ALGERIA);

        //Here were are collecting data to make a decision according to the choose algorithm familly
        inventory.addEmployee(emp1);
        inventory.addEmployee(emp2);
        inventory.addEmployee(emp3);

        //inventory.removeEmployee(emp1);

        //IGR computing with interchangeability between Algorithms
        inventory.calculOneEmlpoyeeIGR("fian");//NOT WORKING, TO IMPROVE!
        //inventory.calculAllEmployeesIGR();
    }
}
