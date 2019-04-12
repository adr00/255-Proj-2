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
        skinType = "$$$";
        regrowth = false;
    }

    public Reptiles(Boolean v, String st, Boolean rg){
        venomous = v;
        skinType = st;
        regrowth = rg;
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