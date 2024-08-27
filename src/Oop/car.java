package Oop;

public class car {
    private String name;
    private String model;
    private String color;
    private int door;

    public car(String name, String model, String color, int door){
        this.name = name;
        this.model = model;
        this.color = color;
        this.door = door ;
    }
    public car(){
        this("BMW", "M5 CS","white",4);
    }
    public void move(){
        System.out.println("the car "+ this.name + " is moving");
    }
    public void stop(){
        System.out.println("the car "+this.name+" is parking");
    }


    //getname return name set name this.name = name
    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public String getModel(){
        return model;
    }
    public void setModel(){
        this.model = model;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public int getDoor(){
        return door;
    }
    public void setDoor(){
        this.door = door;
    }
}
