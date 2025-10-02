import service.EmailValidation;
import service.PassValidator;
import service.UserBlock;

public class AppTest {
    public static void main(String[] args) {

        PassValidator pass = new PassValidator();

        UserBlock user = new UserBlock();

        EmailValidation ev = new EmailValidation();


        //pass.stringValidator(senha);

        //pass.characterValidator(senha);

        //ev.validEmail(".nickmont@gmailcom");


    }

}
