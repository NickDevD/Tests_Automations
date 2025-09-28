import service.PassValidator;
import service.VipValidator;

public class AppTest {
    public static void main(String[] args) {

        PassValidator pass = new PassValidator();

        VipValidator vip = new VipValidator();

        String senha = "carroghj";

        //pass.stringValidator(senha);

        //pass.characterValidator(senha);

        vip.vipCheck(10L, true);

    }

}
