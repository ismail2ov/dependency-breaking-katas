package parameterizeconstructor;

import org.junit.jupiter.api.Test;

class MailCheckerShould {

    @Test
    void check_for_mails() {
        MailChecker mailChecker = new MailChecker(60);
    }
}