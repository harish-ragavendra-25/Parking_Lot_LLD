public class Vehicle {
    private String regNo;
    private String color;
    private VehicleType vehicle_type;

    //args-constructor
    public Vehicle(String regNo,String color,VehicleType vehicle_type){
        this.regNo = regNo;
        this.color = color;
        this.vehicle_type = vehicle_type;
    }

    public void displayDetails(){
        System.out.println("RegNo: "+regNo);
        System.out.println("color: "+color);
        System.out.println("vehicle_type: "+ vehicle_type);
    }

    // Getters and Setters

    public String getRegNo() {
        return regNo;
    }

    public void setRegNo(String regNo) {
        this.regNo = regNo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public VehicleType getVehicle_type() {
        return vehicle_type;
    }

    public void setVehicle_type(VehicleType vehicle_type) {
        this.vehicle_type = vehicle_type;
    }


}
