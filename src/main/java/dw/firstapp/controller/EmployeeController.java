package dw.firstapp.controller;

import dw.firstapp.model.Employee;
import dw.firstapp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    // 의존성 주입(필드 주입)
    EmployeeService employeeService;

    // 매개변수를 사용한 생성자
    @Autowired // 의존성 주입(생성자 주입) → 권장하는 방법!!!(@Autowired를 생략해도 의존성주입 함)
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/api/employee")
    public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
        // Service 코드 필요
        return new ResponseEntity<>(employeeService.saveEmployee(employee)
                , HttpStatus.OK);
    }

    @GetMapping("api/employee")
    public ResponseEntity<List<Employee>>  getAllEmployees(){
       return new ResponseEntity<>(employeeService.getAllEmployees()
        , HttpStatus.OK);

    }

    // DTO(DataTransferObject) : 유저한테 보내줘도 되는 타입으로 클래스를 새로 만드는것
    // → 엔티티와 비슷하지만 다름
    
    // 상태코드200(성공했을때의 코드) : 이거 만드려면 controller에 만든 메소드 타입에
    // ResponseEntity<타입>으로 바꿔주고 return 값도 new ResponseEntity(기존리턴값,HttpStatus.OK) 넣어주면 됨

    @GetMapping("api/employee/{id}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id){ // @PathVariable 뒤에 타입쓸때 대소문자 구분 안한다고 함
        return new ResponseEntity<>(employeeService.getEmployeeById(id),
                HttpStatus.OK);
    }

    // ↓ 특정 ID 검색해서 해당 내용 업데이트 or 신규추가(id값은 autoIncrement = @GenerateValue로 되어있기때문에 지정안하면 자동추가에 따라 추가하게되는것)
    //   → 한개의 튜플만 바꾸면 해당 email 업데이트 
    @PutMapping("api/employee/{id}")
    public ResponseEntity<Employee> updateEmployeeById(@PathVariable Long id,
                                       @RequestBody Employee employee){
        return new ResponseEntity<>(employeeService.updateEmployeeById(id, employee),
                HttpStatus.OK);
    }
    
    // ↓ 특정 ID에 해당되는 값 전체 삭제

    @DeleteMapping("api/employee/{id}")
    public ResponseEntity<Employee> deleteEmployeeById(@PathVariable long id){
        return new ResponseEntity<>(employeeService.deleteEmployeeById(id),
                HttpStatus.OK);
    }


}

