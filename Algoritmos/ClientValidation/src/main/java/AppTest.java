import services.BoundaryTesting;
import services.ContagemOcorrencia;
import services.CredentialValidation;
import services.Iteracao;

public class AppTest {
    public static void main(String[] args) {


        //CredentialValidation cv = new CredentialValidation();

        //BoundaryTesting bt = new BoundaryTesting();

        //Iteracao it = new Iteracao();

        ContagemOcorrencia co = new ContagemOcorrencia();

        co.cont("car", "car for car top");


    }
}
