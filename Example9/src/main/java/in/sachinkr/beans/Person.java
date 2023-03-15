package in.sachinkr.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private final Vehicle vehicle;

    /*
        Let's understand this @Qualifier annotation. If there is multiple beans of same class spring will
        follow some set of rules to get the desired bean.
        1. First it will match the variable name with bean name or bean method name.
        2. Or it will find a @Primary annotation bean.
        3. Or we can define the name of bean using @Qualifier annotation with @Autowired annotation.

        Note: By default autowiring works with data type.
    */
    @Autowired
    @Qualifier("qualiferExBean")
    private QualifierEx qualifierEx2;

    /*
       After seeing the Property and Setter auto-wiring let's see constructor wiring.
       Constructor auto-wiring is  recommended in production environment.
       Because we can declare a variable final when using constructor wiring.
    */

    public Person(){
        System.out.println("If no vehicle found default constructor will be called");
        this.vehicle = null;
    }
    @Autowired(required = false)
    public Person(Vehicle veh){
        this.vehicle = veh;
        System.out.println("Person object is created!");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    /*
       @Autowired annotation marked on field, setter method or constructor is used to tell spring
       to inject dependency at run time. It will find the bean in spring context container if not
       found it will create that bean according to the configuration and inject it into the another
       bean to form a relationship between them.
    */
    /*
       But using it not recommended in production environment because you can't declare it final
       when using @Autowired annotation also may be sometime you don't want that object, and you
       have already put the null check in you business logic but if you've used @Autowired then
       spring will try to find it and if not found it will throw Exception.
    */
    /*
       To solve the above issue use required attribute.
    */
    /*
       The below example is of setter method auto wiring.
    */

//    Comment this because now we are using constructor(recommended) wiring method.
//    @Autowired(required = false)
//    public void setVehicle(Vehicle vehicle) {
//        System.out.println("Vehicle setter method called by spring!");
//        this.vehicle = vehicle;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QualifierEx getQualifierEx() {
        return qualifierEx2;
    }

    public void setQualifierEx(QualifierEx qualifierEx) {
        this.qualifierEx2 = qualifierEx;
    }
}
