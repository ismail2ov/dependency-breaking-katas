package extractandoverridecall;

import org.junit.jupiter.api.Test;

class PageLayoutShould {

    @Test
    void rebind_styles() {
        PageLayout pageLayout = new TestablePageLayout();
        pageLayout.rebindStyles();
    }
}