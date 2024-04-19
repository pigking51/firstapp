package dw.firstapp.model;

// JPA
// SQL 안써도 되는 기술(특징은 맞는데 면접같은곳에서 이렇게 대답하지 말 것)
// → 수준낮다고 평가해서 안좋은 결과 낼수있음
// 어떠한 DB를 써도 코드변형 할 필요가 없음
// 모든 백엔드 프레임워크는 유사한 기능을 가지고 있음

import jakarta.persistence.*;
import org.springframework.boot.SpringApplication;

// ORM
// 비관계형 DB는 못씀
// 비관계형 DB : 출발점이 객체지향언어(그렇기에 문제는 없음)
// Object와 관계형 DB사이 중간을 매핑해주는 것(연결해주는 어떠한 기술)
// JPA는 ORM중에 하나라고 할 수 있지만, 엄밀히 말하면 설계도(스펙이라고 부름)같은 것이라고 함
// → 조금 더 구체적인 것(JPA는 기준가이드 정도라고 함), 자체적으로 여러기술가지고있음
// 짝지어서 나오는 개념이 하이버레이트(hibernate) → 이것이 JPA에서 ORM을 말한다고 보면 됨
// spring.jpa.hibernate.ddl-auto=update
// → ddl-auto= update : 엔티티로 만든 어노테이션을 찾아서 생성을 자동으로 해주겠다

@Entity
@Table(name = "employees")
public class Employee {
    
    // @Id : 이 값이 primary key 라고 지정해주는 거
    // @GenerateValue : 순번이 어떻게 증가하는지 설정하는 거(autoIncrement와 완전 같은개념)
    // → strategy = GenerationType. 쓸때 오라클은 SEQUENCE 쓴다고 함 (여기서는 identity)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    // int로 사용하는 경우도 있지만 보통은 long 씀(실제 DB환경에서 그렇다고 함)
    // → int의 범위를 넘을 가능성이 높기때문에

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email")
    private  String email;
    
    // ↑ 만드는 방식이 DDL(데이터정의어) 만드는것처럼 함
    // @Column 이름 적을 때 캐멀케이스 안쓰고, 한글명칭사용가능

    public Employee() {
    }

    public Employee(long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
