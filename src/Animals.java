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
    private String birthDate;
    private String nativeClimate;
    private String food;
    private String weight;
    private String sex;
    private String animalFacts;
    //private Exhibit exhibit;

    public Animals(){
      this.setName("$$$");
      this.setBirthDate("$$$");
      this.setClimate("$$$");
      this.setFood("$$$");
      this.setWeight("$$$");
      this.setSex("$$$");
    }

    public Animals(String n, String bd, String c, String f, String w, String s){
        this.setName(n);
        this.setBirthDate(bd);
        this.setClimate(c);
        this.setFood(f);
        this.setWeight(w);
        this.setSex(s);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getNativeClimate() {
        return nativeClimate;
    }

    public void setClimate(String climate) {
        this.nativeClimate = climate;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setNativeClimate(String nativeClimate) {
        this.nativeClimate = nativeClimate;
    }

    public String getAnimalFacts() {
        return animalFacts;
    }

    public void setAnimalFacts(String animalFacts) {
        this.animalFacts = animalFacts;
    }
}

