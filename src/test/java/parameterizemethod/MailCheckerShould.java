package parameterizemethod;

import org.junit.jupiter.api.Test;

class MailCheckerShould {

    @Test
    void check_mails() {
        MailChecker mailChecker = new MailChecker();
        mailChecker.setupMail();
    }
}