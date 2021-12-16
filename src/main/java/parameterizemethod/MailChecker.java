package parameterizemethod;

public class MailChecker {
    private MailServer mailServer;

    public void setupMail() {
        this.mailServer = new SmtpMailServer();
        this.mailServer.setup();
    }
}
