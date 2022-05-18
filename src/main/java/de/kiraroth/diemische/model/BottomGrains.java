package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="bottom_grains")
public class BottomGrains {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "b_grain_name")
    private String b_grain_name;

    @Column (name = "b_grain_description")
    private String b_grain_description;

    //Constructor
    public BottomGrains(){}

    public BottomGrains(String b_grain_name, String b_grain_description) {
        super();
        this.b_grain_name = b_grain_name;
        this.b_grain_description = b_grain_description;
    }

    //Getter and Setter
    public String getB_grain_name() {
        return b_grain_name;
    }

    public void setB_grain_name(String b_grain_name) {
        this.b_grain_name = b_grain_name;
    }

    public String getB_grain_description() {
        return b_grain_description;
    }

    public void setB_grain_description(String b_grain_description) {
        this.b_grain_description = b_grain_description;
    }
}
