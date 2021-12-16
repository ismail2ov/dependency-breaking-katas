package parameterizemethod;

public class SmtpMailServer implements MailServer {

    public void setup() {
        throw new RuntimeException("This class cannot be used for tests ");
    }

}
