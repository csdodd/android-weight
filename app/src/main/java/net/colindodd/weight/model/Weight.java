package net.colindodd.weight.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

@Entity
public class Weight {

    @Id(autoincrement = true)
    private Long id;
    private int kg;
    private int g;
    @Generated(hash = 835558898)
    public Weight(Long id, int kg, int g) {
        this.id = id;
        this.kg = kg;
        this.g = g;
    }
    @Generated(hash = 1956860650)
    public Weight() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public int getKg() {
        return this.kg;
    }
    public void setKg(int kg) {
        this.kg = kg;
    }
    public int getG() {
        return this.g;
    }
    public void setG(int g) {
        this.g = g;
    }

    public float getInGrams() {
        return (this.g * 100) + (this.kg * 1000);
    }
}
