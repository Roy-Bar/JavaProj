package ClientsPackage;

public class Branch {
    private int branchNumber;
    private String location;
    private int numberOfEmployees;
    private String phone;
    private Inventory branchInventory;

    public Branch(){
        this.branchNumber = hashCode();
        this.location = null;
        this.numberOfEmployees = 0;
        this.phone = null;
        this.branchInventory = new Inventory();
    }

    public Branch(String location, int numberOfEmployees, String phone){
        this.branchNumber = hashCode();
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
        this.phone = phone;
    }

    public int getBranchNumber() {
        return branchNumber;
    }

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getPhone() {
        return phone;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
