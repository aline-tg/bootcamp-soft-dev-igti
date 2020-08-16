//Script of second part of module 3 in Java
//Created in 2020-08-16 by Aline Guerreiro

import java.lang.String;

public class CLevelClass extends PersonClass{
    private String team;   

    public String getTeam(){
        return team;
    }
    
    public void setTeam(String team){
        this.team = team;
    }

    public String showType(){
        return "C-Level";
    }
}