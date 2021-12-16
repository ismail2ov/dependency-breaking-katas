package pullupfeature;

import org.junit.jupiter.api.Test;

class SchedulerShould {

    @Test
    void update_schedule_item() throws SchedulingException {
        AbstractScheduler scheduler = new TestableScheduler();
        scheduler.updateScheduleItem(new ScheduleItem());
    }
}