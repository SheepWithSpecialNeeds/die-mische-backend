package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="neg_crop_rotations")
public class NegCropRotation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "neg_crop_rotation_id")
    private Integer negCropRotation;

    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crop;

    @Column(name = "neg_rot_crop_id")
    private Integer negCrop_id;

   //Constructor
    public NegCropRotation(){}

    public NegCropRotation(Integer negCropRotation, Crop crop, Integer negCrop_id) {
        this.negCropRotation = negCropRotation;
        this.crop = crop;
        this.negCrop_id = negCrop_id;
    }

    //Getter and Setter
    public Integer getNegCropRotation() {
        return negCropRotation;
    }

    public void setNegCropRotation(Integer negCropRotation) {
        this.negCropRotation = negCropRotation;
    }

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public Integer getNegCrop_id() {
        return negCrop_id;
    }

    public void setNegCrop_id(Integer negCrop_id) {
        this.negCrop_id = negCrop_id;
    }

    //Getter and Setter

}
