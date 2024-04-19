package dw.memo;

public class note240418 {
    // 인터페이스는 어노테이션 x
    // 서비스는 레퍼지토리만 바라봄(repository를 의존성 주입당함)
    // 우리가 하는 작업의 7,80%를 여기서 함(AOP에 따르면 핵심관점)
    
    // spring에서는 void문 안씀(리턴값 받게만듦)
    
    // controller는 restApi를 만듦(주소와 그에 매핑되는 메소드를 만드는것)
    // 원래 api = 함수지만, 각 메소드간에 서로 공유할 수 있도록 약속을 잡는것을 의미
    // →
    
    // 어노테이션 붙으면 기본적으로 생성자는 안만든다고 함
    
    // 필드 혹은 setter로 의존성 주입은 한개만 쓴다고 다 적용되는건 아님
    // → 주입할때마다 적어야함
    // → 그러나 생성자로 의존성 주입을 할 경우에는 한번만 적거나 생략가능
}