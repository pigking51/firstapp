package dw.memo;

public class note240429 {
    // JDBC(Java DataBase Connectivity)
    // 코드레벨에서의 JDBC를 사용할 일은 없다(직접 사용할 일이 없다는 말)
    //  → 우리가 사용하는것이 아닌 JPA가 사용하는 것
    // 무조건 사용해야되긴 하지만?
    // spring FW에서 DB로 가는 방식 3가지(ORM을 사용하지 않는 경우 : JPA가 아닌경우)
    // JDBC, JDBC Template, MYBatis(과거에는 IBatis라고 불렸다고 함)
    // 기본이 SQL임
    // JDBC
    // 되게 옛스럽다(중복되는 코드 많음, 가독성 떨어짐)
    // 가장 오래된 기술, 쓰는기업 거의 없다고함
    
    // JDBC Template
    // JDBC를 개량한 것이기에 JDBC와 거의 유사
    // 단점 : JDBC보다 발전된 것은 맞긴 하지만 여전히 
    // SQL로 입력해야되는것이 많음
    
    // MYBatis(가장 많이 쓰이는 거)
    // 비교적 근래의 기술
    // SQL을 효율적으로 관리해주는 기술
    // 코드를 수정하지 않아도 됨?
    
    // → 대부분 JPA와 MYBatis를 사용한다고 보면 됨(DB연결관리에서)
    // JDBC Template는 오래된 업체정도만 사용(MYBatis로 변환하는것이 그리 어렵지 않다고함)
    // DB는 고수되기 엄청 어려운 분야
    // DB와는 어떤걸로 연결할까? JDBC vs JPA vs MYBatis ← 설명 잘 되어있는 블로그
    // → https://velog.io/@gale4739/DB%EC%99%80%EB%8A%94-%EC%96%B4%EB%96%A4-%EA%B1%B8%EB%A1%9C-%EC%97%B0%EA%B2%B0%ED%95%A0%EA%B9%8C-JDBC-vs-JPA-vs-MyBatis

    // DAO(Database Access Object)
    // JPA를 사용할때는 잘 안쓰지만 JDBC를 사용할 경우에 주로 씀(2개 혼용해서 쓰는 경우도 많다고 함)
    // 로직에서 사용되는 메소드를 사용할 수 있게 만들어주는 것

    // start.spring.io로 만들때
    // 기존 4개(spring web, lombok, mariaDB, JPA) 중에 JPA만 spring DataJDBC로 바꿔서 제너레이트 하기
    // 이거 실습해본거 JDBCproject에 있음
    
    // J
}
