package Case_study.Mode;

public class House extends Services {
    public static Object csv;
    public String roomStandard;
    public String facilities;
    public String numberOfFloors;

    public House(String nameService, String usableArea, String rent, String maxPeople, String rentType, String roomStandard, String facilities, String numberOfFloors) {
        super(nameService, usableArea, rent, maxPeople, rentType);
        this.roomStandard = roomStandard;
        this.facilities = facilities;
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

    public String getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(String numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String showInfo() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
                ", facilities='" + facilities + '\'' +
                ", numberOfFloors='" + numberOfFloors + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rent='" + rent + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentType='" + rentType + '\'' +
                '}';
    }


}
