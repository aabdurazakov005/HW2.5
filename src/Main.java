
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Main {
    public static void main(String[] args) {
        try {
            inputDataUser("qwerty123","123QWerty","123QWerty");
        } catch (WrongPasswordExeption | WrongLoginExeption e) {
            System.out.println(e.getMessage());
        }
    }

    public static void inputDataUser(String login, String password, String confirnPassword) throws WrongLoginExeption, WrongPasswordExeption, WrongPasswordExeption {
        String regexLogin = "^[a-z0-9]{0,20}$";
        Pattern patternLogin = Pattern.compile(regexLogin);
        Matcher matcherLogin = patternLogin.matcher(login);

        String regexPassword = "^[a-z0-9]{0,20}$";
        Pattern patternPassword = Pattern.compile(regexPassword);
        Matcher matcherPassword = patternPassword.matcher(password);

        if (!matcherLogin.matches()) {
            throw new WrongLoginExeption();
        }
        if (!matcherPassword.matches()){
            throw new WrongPasswordExeption();
        }
        if (!password.equals(confirnPassword)){
            throw new WrongPasswordExeption();
        }
    }
}