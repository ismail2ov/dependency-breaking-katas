package pullupfeature;

import org.junit.jupiter.api.Test;

class SchedulerShould {

    @Test
    void update_schedule_item() throws SchedulingException {
        Scheduler scheduler = new Scheduler();
        scheduler.updateScheduleItem(new ScheduleItem());
    }
}