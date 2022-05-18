package de.kiraroth.diemische.model;
import javax.persistence.*;

@Entity
@Table(name="crop_types")

public class CropType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "type_id")
    private Integer type_id;

    //FK
    @ManyToOne
    @JoinColumn(name = "crop_id")
    private Crop crops;

    @Column(name = "type_name")
    private String type_name;

    @Column(name = "type_between_row_spacing")
    private String type_between_row_spacing;

    @Column(name = "type_in_row_spacing")
    private String type_in_row_spacing;

    @Column(name = "type_seeding_depth")
    private String type_seeding_depth;


    //Constructor
    public CropType() {
    }

    public CropType(Integer type_id, Crop crop, String type_name, String type_between_row_spacing, String type_in_row_spacing, String type_seeding_depth) {
        super();
        this.type_id = type_id;
        this.crops = crop;
        this.type_name = type_name;
        this.type_between_row_spacing = type_between_row_spacing;
        this.type_in_row_spacing = type_in_row_spacing;
        this.type_seeding_depth = type_seeding_depth;
    }




    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Crop getCrop() {
        return crops;
    }

    public void setCrop(Crop crop) {
        this.crops = crop;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public String getType_between_row_spacing() {
        return type_between_row_spacing;
    }

    public void setType_between_row_spacing(String type_between_row_spacing) {
        this.type_between_row_spacing = type_between_row_spacing;
    }

    public String getType_in_row_spacing() {
        return type_in_row_spacing;
    }

    public void setType_in_row_spacing(String type_in_row_spacing) {
        this.type_in_row_spacing = type_in_row_spacing;
    }

    public String getType_seeding_depth() {
        return type_seeding_depth;
    }

    public void setType_seeding_depth(String type_seeding_depth) {
        this.type_seeding_depth = type_seeding_depth;
    }
}

