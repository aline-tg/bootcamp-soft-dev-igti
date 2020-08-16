//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

public class TruckerClass implements LocomotionInterface {
    private String frame;
    private String model;
    private Integer axes;
    private Double speed;

    public String getFrame(){
        return frame;
    }
    public void setFrame(String frame){
        this.frame = frame;
    }

    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }

    public Integer getAxes(){
        return axes;
    }
    public void setAxes(Integer axes){
        this.axes = axes;
    }

    public Double getSpeed(){
        return speed;
    }
    public void setSpeed(Double speed){
        this.speed = speed;
    }

    @Override
    public void speedUp(){
        speed += 2;
    }

    @Override
    public void stop(){
        if (speed > 0) {
            speed -= 2;
        }
    }
}