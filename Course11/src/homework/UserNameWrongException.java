package homework;

public class UserNameWrongException extends RuntimeException {
    @Override
    public String getMessage() {
        return "用户名错误！";
    }
}
