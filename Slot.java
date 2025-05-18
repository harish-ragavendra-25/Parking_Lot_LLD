public class Slot {
    private int slotNo;
    private VehicleType vehicle_type;
    private boolean isFree = true;
    private Vehicle vehicle;

    //args-constructor
    public Slot(int slotNo,VehicleType vehicle_type) {
        this.slotNo = slotNo;
        this.vehicle_type = vehicle_type;
    }

    public boolean isFree(){
        return this.isFree;
    }

    public void park(Vehicle vehicle){
        this.vehicle = vehicle;
        this.isFree = false;
    }

    public Vehicle unPark(){
        Vehicle temp = this.vehicle;
        this.vehicle = null;
        this.isFree = true;
        return temp;
    }

    //Getters and Setters

    public int getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(int slotNo) {
        this.slotNo = slotNo;
    }

    public VehicleType getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(VehicleType vehicle_type) {
        this.vehicle_type = vehicle_type;
    }

    public boolean isIsFree() {
        return isFree;
    }

    public void setIsFree(boolean isFree) {
        this.isFree = isFree;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }


}