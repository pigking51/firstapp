package dw.firstapp.repository;

import dw.firstapp.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// 여기에는 SQL 코드들이 들어감
// 필요한 SQL이 정의된 메소드를 서비스에서 가져다 씀
// SQL에서 만들어야 될 것을 JPA가 알아서 다 만들어주지만, JpaRepository를 상속해야됨
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
