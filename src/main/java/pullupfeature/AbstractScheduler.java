package pullupfeature;

import java.util.List;

public abstract class AbstractScheduler {
    private List<ScheduleItem> items;

    public void updateScheduleItem(ScheduleItem item) throws SchedulingException {
        try {
            validate(item);
        } catch (ConflictException e) {
            throw new SchedulingException(e);
        }
    }

    protected abstract void validate(ScheduleItem item) throws ConflictException;

    public int getDeadTime() {
        int result = 0;
        for (ScheduleItem item : items) {
            if (item.getType() != ScheduleItem.TRANSIENT && notShared(item)) {
                result += item.getSetupTime() + clockTime();
            }
            if (item.getType() != ScheduleItem.TRANSIENT) {
                result += item.finishingTime();
            } else {
                result += getStandardFinish(item);
            }
        }

        return result;
    }

    private int clockTime() {
        return 0;
    }

    private int getStandardFinish(ScheduleItem item) {
        return 0;
    }

    private boolean notShared(ScheduleItem item) {
        return false;
    }
}
