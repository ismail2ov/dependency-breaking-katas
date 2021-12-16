package parameterizeconstructor;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;

class MailCheckerShould {

    @Test
    void check_for_mails() {
        MailReceiver mailReceiver = mock(MailReceiver.class);
        MailChecker mailChecker = new MailChecker(mailReceiver, 60);
    }
}