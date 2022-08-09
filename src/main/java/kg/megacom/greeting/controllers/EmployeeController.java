package kg.megacom.greeting.controllers;

import kg.megacom.greeting.models.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {


    @GetMapping("/employee/{name}")
    public Employee getEmployee(@PathVariable String name){
        Employee employee = new Employee(1l, name, "Sydalieva");
        return employee;
    }

    @GetMapping("/employee")
    public Employee get(@RequestParam String name){
        Employee employee = new Employee(1l, name, "Sydalieva");
        return employee;
    }
}
