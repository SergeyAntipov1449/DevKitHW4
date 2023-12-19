package org.example;
/**
 * Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников
 * - каждый сотрудник должен иметь следующие атрибуты:
 * Табельный номер
 * Номер телефона
 * Имя
 * Стаж
 * Добавить метод, который ищет сотрудника по стажу (может быть список)
 * Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
 * Добавить метод, который ищет сотрудника по табельному номеру
 * Добавить метод добавление нового сотрудника в справочник сотрудников
 */
public class Main {
    public static void main(String[] args) {
        EmployeeCatalog emps = new EmployeeCatalog();
        emps.add(new Employee(1, 79214546456L, "Mark", 10));
        emps.add(new Employee(2, 79113838577L, "John", 5));
        emps.add(new Employee(3, 79818761234L, "Kate", 1));
        emps.add(new Employee(4, 79265676868L, "Jennifer", 20));
        emps.add(new Employee(5, 79999876655L, "Helen", 2));
        emps.add(new Employee(6, 79288761234L, "Peter", 10));
        emps.add(new Employee(7, 79213232987L, "Jack", 1));
        emps.add(new Employee(8, 79118763421L, "Mark", 6));
        emps.add(new Employee(9, 79007476783L, "John", 10));
        emps.add(new Employee(10, 79899477645L, "Mary", 2));
        emps.add(new Employee(11, 79810985434L, "Helen", 7));
        emps.add(new Employee(12, 79996543764L, "Kate", 5));
        emps.add(new Employee(13, 79119348587L, "Mark", 2));



        System.out.println(emps.searchBySeniority(5));

        System.out.println(emps.searchPhoneByName("Mark"));

        System.out.println(emps.searchByID(4));
    }
}