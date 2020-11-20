package Case_study.Mode;

public class Room extends Services {
    public String freeService;

    public Room(String nameService, String usableArea, String rent, String maxPeople, String rentType, String freeService) {
        super(nameService, usableArea, rent, maxPeople, rentType);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String showInfo() {
        return "Room{" +
                "freeService='" + freeService + '\'' +
                ", nameService='" + nameService + '\'' +
                ", usableArea='" + usableArea + '\'' +
                ", rent='" + rent + '\'' +
                ", maxPeople='" + maxPeople + '\'' +
                ", rentType='" + rentType + '\'' +
                '}';
    }
}
