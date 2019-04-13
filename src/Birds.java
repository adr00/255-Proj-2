/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drewk
 */
public class Birds extends Animals {
    private Boolean fly;
    private String wingSpan;
    private String beakType;
    private String eggDesc;

    public Birds(){
        super();
        fly = false;
       
    }

    public Birds(String n, Boolean f){
        super(n);
        fly = f;
        
    }
    
    @Override
    public String getName()
    {
        return super.getName();
    }

    public Boolean getFly() {
        return fly;
    }

    public void setFly(Boolean fly) {
        this.fly = fly;
    }

    public String getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    public String getBeakType() {
        return beakType;
    }

    public void setBeakType(String beakType) {
        this.beakType = beakType;
    }

    public String getEggDesc() {
        return eggDesc;
    }

    public void setEggDesc(String eggDesc) {
        this.eggDesc = eggDesc;
    }
}

