/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drewk
 */
public class Mammals extends Animals {
    private String hairtype;
    private Boolean thumb;
    private Boolean isNoctournal;

    public Mammals(){
        isNoctournal = false;
    }

    public Mammals(String n, Boolean noc){
        super(n);
        isNoctournal = noc;
    }
    
    public String getName()
    {
        return super.getName();
    }

    public String getHairtype() {
        return hairtype;
    }

    public void setHairtype(String hairtype) {
        this.hairtype = hairtype;
    }

    public Boolean getNoctournal() {
        return isNoctournal;
    }

    public void setNoctournal(Boolean noctournal) {
        isNoctournal = noctournal;
    }

    public Boolean getThumb() {
        return thumb;
    }

    public void setThumb(Boolean thumb) {
        this.thumb = thumb;
    }
}
