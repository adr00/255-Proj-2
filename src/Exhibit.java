/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author adrsw
 */
public class Exhibit {
    
    Birds bird1;
    Mammals mamm1;
    Mammals mamm2;
    Reptiles reptile;
    Birds bird2;
    
    
    public Exhibit(Birds b, Mammals m1, Mammals m2, Reptiles r)
    {
        bird1 = b;
        mamm1 = m1;
        mamm2 = m2;
        reptile = r;
    }
    
    public Exhibit(Birds b1, Mammals m1, Mammals m2, Birds b2)
    {
        bird1 = b1;
        mamm1 = m1;
        mamm2 = m2;
        bird2 = b2;
    }
    
    public Birds getBird1() {
        return bird1;
    }

    public void setBird1(Birds bird1) {
        this.bird1 = bird1;
    }

    public Mammals getMamm1() {
        return mamm1;
    }

    public void setMamm1(Mammals mamm1) {
        this.mamm1 = mamm1;
    }

    public Mammals getMamm2() {
        return mamm2;
    }

    public void setMamm2(Mammals mamm2) {
        this.mamm2 = mamm2;
    }

    public Reptiles getReptile() {
        return reptile;
    }

    public void setReptile(Reptiles reptile) {
        this.reptile = reptile;
    }
    
}
