
public class Ticket {
    private String ticketId;
    private int floorNo;
    private int slotNo;
    private Vehicle vehicle;

    // args-constructor
    public Ticket(String ticketId,int floorNo,int slotNo,Vehicle vehicle) {
        this.ticketId = ticketId;
        this.floorNo = floorNo;
        this.slotNo = slotNo;
        this.vehicle = vehicle;
    }

    // Getters and Setters

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
