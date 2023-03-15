package in.sachinkr.beans;

public class Vehicle {
    String name;

    public Vehicle(){
        System.out.println("Vehicle object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
