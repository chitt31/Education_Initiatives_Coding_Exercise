package structural.adapter;

public class USPlugAdapter implements Socket {
    private USPlug usPlug;

    public USPlugAdapter(USPlug usPlug) {
        this.usPlug = usPlug;
    }

    @Override
    public void providePower() {
        usPlug.provideUSPower();
    }
}
