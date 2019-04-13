/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drewk
 */
public class Reptiles extends Animals {
    private Boolean venomous;
    private String skinType; //(scales, scutes, or shell)
    private Boolean regrowth;

    public Reptiles(){
        venomous = false;
        
    }

    public Reptiles(String n,Boolean v){
        super(n);
        venomous = v;
       
    }
    public String getName()
    {
        return super.getName();
    }

    public Boolean getVenomous() {
        return venomous;
    }

    public void setVenomous(Boolean venomous) {
        this.venomous = venomous;
    }

    public String getSkinType() {
        return skinType;
    }

    public void setSkinType(String skinType) {
        this.skinType = skinType;
    }

    public Boolean getRegrowth() {
        return regrowth;
    }

    public void setRegrowth(Boolean regrowth) {
        this.regrowth = regrowth;
    }
}