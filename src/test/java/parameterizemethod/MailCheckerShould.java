package parameterizemethod;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class MailCheckerShould {

    @Test
    void check_mails() {
        MailServer mailServer = mock(MailServer.class);
        MailChecker mailChecker = new MailChecker();
        mailChecker.setupMail(mailServer);
    }
}