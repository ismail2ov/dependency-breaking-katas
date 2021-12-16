package pullupfeature;

import java.util.Iterator;
import java.util.List;

public class Scheduler extends AbstractScheduler {

    @Override
    protected void validate(ScheduleItem item) throws ConflictException {
        throw new ConflictException("This method cannot be used for tests");

    }

}
