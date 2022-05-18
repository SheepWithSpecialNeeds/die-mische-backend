package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="pos_polycultivations")
public class PosPolyCultivation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="pos_polycultivation_id" )
    private Integer posPolycultivation;

    @Column(name ="pos_crop_id" )
    private Integer pos_crop_id;

    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;

    //Constructor
    public PosPolyCultivation(){}
    public PosPolyCultivation(Integer posPolycultivation, Integer posCrop_id, Crop crop) {
        this.posPolycultivation = posPolycultivation;
        this.pos_crop_id = posCrop_id;
        this.crop = crop;
    }

    // Getter and Setter
    public Integer getPosPolycultivation() {
        return posPolycultivation;
    }

    public void setPosPolycultivation(Integer posPolycultivation) {
        this.posPolycultivation = posPolycultivation;
    }

    public Integer getPos_crop_id() {
        return pos_crop_id;
    }

    public void setPos_crop_id(Integer pos_crop_id) {
        this.pos_crop_id = pos_crop_id;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }




}
