package Case_study.Mode;

public abstract class Services {
    protected String nameService;
    protected String usableArea;
    protected String rent;
    protected String maxPeople;
    protected String rentType;

    public Services(String nameService, String usableArea, String rent, String maxPeople, String rentType) {
        this.nameService = nameService;
        this.usableArea = usableArea;
        this.rent = rent;
        this.maxPeople = maxPeople;
        this.rentType = rentType;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public String getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(String usableArea) {
        this.usableArea = usableArea;
    }

    public String getRent() {
        return rent;
    }

    public void setRent(String rent) {
        this.rent = rent;
    }

    public String getMaxPeople() {
        return maxPeople;
    }

    public void setMaxPeople(String maxPeople) {
        this.maxPeople = maxPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract String showInfo();

}
