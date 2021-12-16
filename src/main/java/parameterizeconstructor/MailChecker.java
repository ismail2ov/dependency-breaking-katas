package parameterizeconstructor;

public class MailChecker {
    private MailReceiver receiver;
    private int checkPeriodSeconds;

    public MailChecker(int checkPeriodSeconds) {
        this.receiver = new SmtpMailReceiver();
        this.checkPeriodSeconds = checkPeriodSeconds;
    }

    public MailChecker(MailReceiver mailReceiver, int checkPeriodSeconds) {
        receiver = mailReceiver;
        this.checkPeriodSeconds = checkPeriodSeconds;
    }
}
