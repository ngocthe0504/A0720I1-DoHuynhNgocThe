package Case_study.Mode;

public class Villa extends Services {
    public String roomStandard;
    public String facilities;
    public String swimmingPoolArea;
    public String numberOfFloors;

    public Villa(String nameService, String usableArea, String rent, String maxPeople, String rentType, String roomStandard, String facilities, String swimmingPoolArea, String numberOfFloors) {
        super(nameService, usableArea, rent, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.facilities = facilities;
        this.swimmingPoolArea = swimmingPoolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFacilities() {
        return facilities;
    }

    public void setFacilities(String facilities) {
        this.facilities = facilities;
    }

    public String getSwimmingPoolArea() {
        return swimmingPoolArea;
    }

    public void setSwimmingPoolArea(String swimmingPoolArea) {
        this.swimmingPoolArea = swimmingPoolArea;
    }

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", facilities='" + facilities + '\'' +
                ", swimmingPoolArea='" + swimmingPoolArea + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rent='" + rent + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentType='" + rentType + '\'' +
                '}';
    }

}
