package com.autobots.java.streamAPI;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindAverageSalary {
    public static void main(String[] args) {

        List<Employee> employees = List.of(
                new Employee(1, "Alice", 28, 3000, "IT"),
                new Employee(2, "Bob", 35, 4000, "HR"),
                new Employee(3, "Charlie", 40, 5000, "Finance"),
                new Employee(4, "David", 25, 3500, "IT"),
                new Employee(5, "Eva", 30, 4200, "Marketing"),
                new Employee(6, "Frank", 45, 6000, "Finance"),
                new Employee(7, "Grace", 32, 4100, "HR"),
                new Employee(8, "Henry", 29, 3900, "IT"),
                new Employee(9, "Isabel", 38, 4500, "Marketing"),
                new Employee(10, "Jack", 27, 3600, "IT")
        );

        Map<String, Double> averageSalary = new HashMap<>();
        Map<String, Integer> totalSum = new HashMap<>();
        int count = 0;
        for (Employee employee : employees){
            averageSalary.put(employee.getDepartment(),
                    averageSalary.getOrDefault(employee.getDepartment(),
                            0.0) + employee.getSalary());
            totalSum.put(employee.getDepartment(), totalSum.getOrDefault(employee.getDepartment(), 0) +1);
        }
        double avrSalary = 0.0;
        for (String department : averageSalary.keySet()){
            avrSalary = averageSalary.get(department) / totalSum.get(department);
            System.out.printf("%s -> $%.2f%n", department, avrSalary);
        }

        Map<String, Double> averageDalaryByDep = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        averageDalaryByDep.forEach((dep, averSalary) ->
                System.out.println(dep + "-> $" + averSalary));
    }
}
