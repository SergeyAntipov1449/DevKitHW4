package org.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeCatalog {
    private Map<Long, Employee> employees;

    public EmployeeCatalog() {
        employees = new HashMap<>();
    }

    public List<Employee> searchBySeniority(double seniority) {
        return employees.values().stream()
                .filter((employee) -> (employee.getSeniority() == seniority))
                .toList();
    }

    public List<Long> searchPhoneByName(String name) {
        return employees.values().stream()
                .filter((employee) -> (employee.getName().equals(name)))
                .map(Employee::getPhoneNumber)
                .toList();

    }

    public List<Employee> searchByID(long id) {
        return employees.values().stream()
                .filter((employee) -> (employee.getId() == id))
                .toList();
    }

    public void add(Employee employee) {
        employees.put((long) employee.getId(), employee);
    }

}
