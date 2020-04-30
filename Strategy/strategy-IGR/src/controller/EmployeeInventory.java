package controller;

import model.Employee;
import model.EmployeeDTO;

import java.util.ArrayList;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from Ivory Coast and his annual salary is "+emp.getSalary()+" FCFA and  IGR's is "+igr);
                       break;
                    case "MOROCCO":

                        igrStrategy = new Morocco();
                         igr =  igrStrategy.getIGR(emp.getSalary());
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from Morocco and his annual salary is "+emp.getSalary()+" DHS and IGR's is "+igr);
                        break;
                    case "ALGERIA":

                        igrStrategy = new Algeria();
                         igr =  igrStrategy.getIGR(emp.getSalary());
                        System.out.println(emp.getFname()+" "+emp.getLname()+" coming from Algeria and his annual salary is "+emp.getSalary()+" DINARS and IGR's is "+igr);
                        break;
                    default:
                        System.out.println("ERROR");
                }


            }
        }
    }


    public void calculOneEmlpoyeeIGR(String name) {

        ArrayList<EmployeeDTO> emps = getEmployeesInfo();
        Stream<EmployeeDTO> employeeDTOStream = emps.stream();
        ArrayList<EmployeeDTO> employeeDTOToSearch = (ArrayList<EmployeeDTO>) employeeDTOStream.
               filter(employee -> (employee.getLname().toLowerCase().contains(name.toLowerCase()) || employee.getFname().toLowerCase().contains(name.toLowerCase())) || (employee.getLname().toUpperCase().contains(name.toUpperCase()) || employee.getFname().toUpperCase().contains(name.toUpperCase())) || (employee.getLname().contains(name) || employee.getFname().contains(name)) )
                .collect(Collectors.toList());

        if(!employeeDTOToSearch.isEmpty()) {
            employeeDTOToSearch.forEach(employeeDTO -> {
                IGR igrStrategy;
                float igr = 0;
                switch (employeeDTO.getCountry()) {

                    case "CI":

                        igrStrategy = new CI();
                        igr = igrStrategy.getIGR(employeeDTO.getSalary());
                        System.out.println(employeeDTO.getFname() + " " + employeeDTO.getLname() + " coming from Ivory Coast and his annual salary is " + employeeDTO.getSalary() + " IGR's is " + igr);
                        break;
                    case "MOROCCO":

                        igrStrategy = new Morocco();
                        igr = igrStrategy.getIGR(employeeDTO.getSalary());
                        System.out.println(employeeDTO.getFname() + " " + employeeDTO.getLname() + " coming from Morocco and his annual salary is " + employeeDTO.getSalary() + " IGR's is " + igr);
                        break;
                    case "ALGERIA":

                        igrStrategy = new Algeria();
                        igr = igrStrategy.getIGR(employeeDTO.getSalary());
                        System.out.println(employeeDTO.getFname() + " " + employeeDTO.getLname() + " coming from " + employeeDTO.getCountry() + " annual salary is " + employeeDTO.getSalary() + " IGR's is " + igr);
                        break;
                    default:
                        System.out.println("ERROR");
                }
            });
        }
        else
        {
            throw new RuntimeException("No employee found!");
        }


            }
        }



