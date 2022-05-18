package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name = "light")
public class Light {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="light_id")
    private long light_id;

    @Column(name="light_name")
    private String light_name;

    //Constructors
    public Light(){}

    public Light(long light_id, String light_name) {
        super();
        this.light_id = light_id;
        this.light_name = light_name;

    }

    //Getter and Setter
    public long getLight_id() {
        return light_id;
    }

    public void setLight_id(long light_id) {
        this.light_id = light_id;
    }


    public String getLight_name() {
        return light_name;
    }

    public void setLight_name(String light_name) {
        this.light_name = light_name;
    }


}
