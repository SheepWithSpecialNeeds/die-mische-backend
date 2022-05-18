package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="neg_polycultivations")
public class NegPolyCultivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="neg_polycultivation_id" )
    private Integer negPolycultivation;

    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;

    @Column(name ="neg_crop_id" )
    private Integer neg_crop_id;

    //Constructor
    public NegPolyCultivation(){}

    public NegPolyCultivation(Integer negPolycultivation, Crop crop, Integer neg_crop_id) {
        this.negPolycultivation = negPolycultivation;
        this.crop = crop;
        this.neg_crop_id = neg_crop_id;
    }

    //Getter and Setter
    public Integer getNegPolycultivation() {
        return negPolycultivation;
    }

    public void setNegPolycultivation(Integer negPolycultivation) {
        this.negPolycultivation = negPolycultivation;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Integer getNeg_crop_id() {
        return neg_crop_id;
    }

    public void setNeg_crop_id(Integer neg_crop_id) {
        this.neg_crop_id = neg_crop_id;
    }
}
