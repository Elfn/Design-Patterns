package controller;

import model.Employee;
import model.EmployeeDTO;

import java.util.ArrayList;

/**
 * Created by Elimane on Apr, 2020, at 13:16
 */
public class EmployeeInventory {

    ArrayList<Employee> employeesList;

    public  EmployeeInventory(){
        this.employeesList = new ArrayList<>();
    }

    public void addEmployee(Employee employee)
    {
        employeesList.add(employee);
    }

    public void removeEmployee(Employee employee)
    {
        employeesList.remove(employee);
    }

    public ArrayList<EmployeeDTO> getEmployeesInfo()
    {
        ArrayList<EmployeeDTO> employeeDTOS = new ArrayList<>();
        for(Employee emp : employeesList)
        {

                EmployeeDTO employeeDTO = new EmployeeDTO();
                employeeDTO.setCountry(emp.getCountry().toString());
                employeeDTO.setSalary(emp.getAnnualSalary());
                employeeDTO.setFname(emp.getFirstName());
                employeeDTO.setLname(emp.getLastName());
                employeeDTOS.add(employeeDTO);

        }

        return employeeDTOS;
    }

    public void calculAllEmployeesIGR() {
        IGR igrStrategy;
        ArrayList<EmployeeDTO> emps = getEmployeesInfo();
        float igr = 0;
        for (EmployeeDTO emp : emps) {
            {
                switch(emp.getCountry()) {

                    case "CI":

                       igrStrategy = new CI();
                         igr =  igrStrategy.getIGR(emp.getSalary());
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from "+ emp.getCountry() +" annual salary is "+emp.getSalary()+" IGR's is "+igr);
                       break;
                    case "MOROCCO":

                        igrStrategy = new Morocco();
                         igr =  igrStrategy.getIGR(emp.getSalary());
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from "+ emp.getCountry() +" annual salary is "+emp.getSalary()+" IGR's is "+igr);
                        break;
                    case "ALGERIA":

                        igrStrategy = new Algeria();
                         igr =  igrStrategy.getIGR(emp.getSalary());
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from "+ emp.getCountry() +" annual salary is "+emp.getSalary()+" IGR's is "+igr);
                        break;
                    default:
                        System.out.println("ERROR");
                }


            }
        }
    }


    public void calculOneEmlpoyeeIGR(String name) {
        IGR igrStrategy;
        ArrayList<EmployeeDTO> emps = getEmployeesInfo();
        float igr = 0;
        for (EmployeeDTO emp : emps) {
            {
                if(emp.getFname().equals(name) || emp.getLname().equals(name) ) {
                    switch (emp.getCountry()) {

                        case "CI":

                            igrStrategy = new CI();
                            igr = igrStrategy.getIGR(emp.getSalary());
                            System.out.println(emp.getFname()+" "+emp.getLname()+" coming from " + emp.getCountry() + " annual salary is " + emp.getSalary() + " IGR's is " + igr);
                            break;
                        case "MOROCCO":

                            igrStrategy = new Morocco();
                            igr = igrStrategy.getIGR(emp.getSalary());
                            System.out.println(emp.getFname()+" "+emp.getLname()+" coming from " + emp.getCountry() + " annual salary is " + emp.getSalary() + " IGR's is " + igr);
                            break;
                        case "ALGERIA":

                            igrStrategy = new Algeria();
                            igr = igrStrategy.getIGR(emp.getSalary());
                            System.out.println(emp.getFname()+" "+emp.getLname()+" coming from " + emp.getCountry() + " annual salary is " + emp.getSalary() + " IGR's is " + igr);
                            break;
                        default:
                            System.out.println("ERROR");
                    }
                }
                else {
                    throw new RuntimeException("No Employee found !");
                }

            }
        }
    }

}
