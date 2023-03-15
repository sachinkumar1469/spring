package in.sachinkr.beans;

public class Vehicle {
    public Vehicle(){
        System.out.println("Vehicle object is created!");
    }
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
