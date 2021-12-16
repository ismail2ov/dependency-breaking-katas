package exposestaticmethod;

import org.junit.jupiter.api.Test;

class RCSWorkflowShould {

    @Test
    void validate_packet() throws Exception {
        Packet packet = new Packet();
        RCSWorkflow.validatePacket(packet);
    }
}