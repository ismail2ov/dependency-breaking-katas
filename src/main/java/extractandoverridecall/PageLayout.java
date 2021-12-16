package extractandoverridecall;

import java.util.List;

public class PageLayout {

    private int id = 0;
    private List styles;
    private StyleTemplate template;

    protected void rebindStyles() {
        styles = getFormStyles();
    }

    protected List getFormStyles() {
        return StyleMaster.formStyles(template, id);
    }
}
