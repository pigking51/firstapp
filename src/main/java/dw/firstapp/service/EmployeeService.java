package dw.firstapp.service;

import dw.firstapp.exception.ResourceNotFoundException;
import dw.firstapp.model.Employee;
import dw.firstapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public List<Employee> getAllEmployees(){
      return employeeRepository.findAll();
                // findAll : SQL에서는 select * 같은 개념임
                // findById : primary key로 찾는다는거
    }

    public Employee getEmployeeById(long id){
        Optional<Employee> employee = employeeRepository.findById(id);
        // 제네릭한 Optional의 employee의 값이 없으면 true로 반환함
        // → null을 주지 않는 구조가 됨(NullPointException오류 안뜸)
        if(employee.isEmpty()){
            // 예외처리
            throw new ResourceNotFoundException("Employee", "ID", id);
        } else{
            return employee.get();
        }
    }

    public Employee updateEmployeeById(long id, Employee employee){
        // ↓ ID로 해당 데이터 찾기
        Optional<Employee> employee1 = employeeRepository.findById(id);
        if(employee1.isPresent()){
            // 데이터 업데이트
            employee1.get().setEmail(employee.getEmail());
            employee1.get().setFirstName(employee.getFirstName());
            employee1.get().setLastName(employee.getLastName());
            // ↓ 실제로 DB에 저장하기
            employeeRepository.save(employee1.get());
            return employee1.get();
        } else{
            throw new ResourceNotFoundException("Employee", "ID", id);
        }
    }

    public Employee deleteEmployeeById(long id){
        Optional<Employee> employee2 = employeeRepository.findById(id);
        if(employee2.isEmpty()){
            throw new ResourceNotFoundException("Employee", "ID", id);
        }else{
            employeeRepository.deleteById(id);
            return employee2.get();
        }
    }
}
