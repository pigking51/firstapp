package dw.firstapp.controller;

import dw.firstapp.model.Employee;
import dw.firstapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    // 의존성 주입
    @Autowired
    EmployeeService employeeService;
    @PostMapping("/api/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        // Service 코드 필요
        return employeeService.saveEmployee(employee);
    }
}
