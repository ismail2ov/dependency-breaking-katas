package exposestaticmethod;

public class Packet {
    private final String originator = "AIM";

    public String getOriginator() {
        return originator;
    }

    public int getLength() {
        return 0;
    }

    public boolean hasValidCheckSum() {
        return true;
    }

}