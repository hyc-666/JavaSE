package homework;

public class PassWordWrongException extends RuntimeException {
    @Override
    public String getMessage() {
        return "密码输入错误";
    }
}
