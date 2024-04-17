package dw.firstapp.service;

import dw.firstapp.model.Employee;
import dw.firstapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// service는 로직이라고 보면 됨
@Service
public class EmployeeService {
    // 의존성 주입
    @Autowired
    EmployeeRepository employeeRepository;
    public Employee saveEmployee(Employee employee){
        // repository 코드 있어야 됨 - save : insert 역할
        employeeRepository.save(employee);
        return employee;
    }
}
