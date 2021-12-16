package extractandoverridecall;

import java.util.ArrayList;
import java.util.List;

public class TestablePageLayout extends PageLayout {
    @Override
    protected List getFormStyles() {
        return new ArrayList();
    }
}
