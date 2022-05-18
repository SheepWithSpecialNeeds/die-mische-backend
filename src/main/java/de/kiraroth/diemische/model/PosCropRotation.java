package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="pos_crop_rotations")
public class PosCropRotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pos_crop_rotation_id")
    private Integer posCropRotation_id;

    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;

    @Column(name = "pos_rot_crop_id")
    private Integer posCrop_id;

    //Constructor
    public PosCropRotation(){}

    public PosCropRotation(Integer posCropRotation_id, Crop crop, Integer posCrop_id) {
        this.posCropRotation_id = posCropRotation_id;
        this.crop = crop;
        this.posCrop_id = posCrop_id;
    }
    
    //Getter and Setter
    public Integer getPosCropRotation_id() {
        return posCropRotation_id;
    }

    public void setPosCropRotation_id(Integer posCropRotation_id) {
        this.posCropRotation_id = posCropRotation_id;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Integer getPosCrop_id() {
        return posCrop_id;
    }

    public void setPosCrop_id(Integer posCrop_id) {
        this.posCrop_id = posCrop_id;
    }



}
