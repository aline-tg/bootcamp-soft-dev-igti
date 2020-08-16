//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

public class CarsClass implements LocomotionInterface {
    private String model;
    private String color;
    private Integer year;
    private Double speed; 

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public Integer getYear(){
        return year;
    }
    public void setYear(Integer year){
        this.year = year;
    }

    public Double getSpeed(){
        return speed;
    }
    public void setSpeed(Double speed){
        this.speed = speed;
    }

    @Override
    public void speedUp(){
        speed += 5;
    }

    @Override
    public void stop(){
        if (speed > 0) {
            speed -= 5;
        }
    }
}