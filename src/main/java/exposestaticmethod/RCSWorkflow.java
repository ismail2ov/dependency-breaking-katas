package exposestaticmethod;

abstract class RCSWorkflow {
    private static int MAX_LENGTH = 255;

    public void validate(Packet packet) throws Exception {
        if (packet.getOriginator().equals("MIA")
                || packet.getLength() > MAX_LENGTH
                || !packet.hasValidCheckSum()) {
            throw new Exception();
        }
    }


}
