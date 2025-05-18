public class SlotLocation {
    private final Floor floor;
    private final Slot slot;

    public SlotLocation(Floor floor,Slot slot){
        this.floor = floor;
        this.slot = slot;
    }

    public Floor getFloor() {
        return floor;
    }

    public Slot getSlot() {
        return slot;
    }
}
