package dw.firstapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND) // http의 상태코드를 의미
public class ResourceNotFoundException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    // → serialVersionUID : 없어도 상관없으나 코드 아이디를 구별하기 위해 사용?(선택사항)
    private String resourceName;
    private String fieldName;
    private Object fieldValue;

    // ↑ 필수아님!!!

    public ResourceNotFoundException(String resourceName, String fieldName, Object fieldValue) {
        super(String.format("%s not found with %s : %s",
                resourceName, fieldName, fieldValue)); // C 스타일(옛날방식)
        this.resourceName = resourceName;
        this.fieldName = fieldName;
        this.fieldValue = fieldValue;
    }
    public String getResourceName() {
        return resourceName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public Object getFieldValue() {
        return fieldValue;
    }
}
