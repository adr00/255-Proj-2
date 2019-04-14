/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drewk
 */
public class Animals {
    private String name;
    //private Exhibit exhibit;

    public Animals(){
      this.setName("$$$");
    }

    public Animals(String n){
        this.setName(n);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

