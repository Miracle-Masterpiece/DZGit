public class GearBox {

    public static final int MIN_GEAR = 1;
    public static final int MAX_GEAR = 6;

    private int gear = 0;
    private final GearBoxType type;

    public GearBox(GearBoxType type) {
        this.type = type;
    }

    public void shiftUp() {
        gear = gear < MAX_GEAR ? ++gear : gear;
    }

    public void shiftDown() {
        gear = gear < MIN_GEAR ? --gear : gear;
    }

    public void switchRear() {
        gear = gear > 1 ? gear : -1;
    }

    public void switchNeutral() {
        gear = 0;
    }

    public int getCurrentGear() {
        return gear;
    }

    public GearBoxType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "[gear=" + Integer.toString(gear) + "]";
    }

    @Override
    public int hashCode() {
        return gear;
    }

    @Override
    public boolean equals(Object g) {
        if (g instanceof GearBox)
            return gear == ((GearBox) g).gear;
        return false;
    }
}
