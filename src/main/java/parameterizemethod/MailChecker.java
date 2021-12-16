package parameterizemethod;

public class MailChecker {
    private MailServer mailServer;

    public void setupMail() {
        this.mailServer = new SmtpMailServer();
        this.mailServer.setup();
    }

    public void setupMail(MailServer mailServer) {
        this.mailServer = mailServer;
        this.mailServer.setup();
    }
}
