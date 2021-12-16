package parameterizeconstructor;

public class SmtpMailReceiver implements MailReceiver {
    public SmtpMailReceiver() {
        throw new RuntimeException("This class cannot be used for tests ");
    }
}
