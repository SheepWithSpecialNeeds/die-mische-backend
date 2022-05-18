package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name = "location_requirements")
public class LocationRequirements {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="loc_req_id")
    private Integer loc_req_id;

    @Column(name = "light_id")
    private Integer light_id;

    @Column(name = "crop_type_id")
    private Integer crop_type_id;

    //Constructor
    public LocationRequirements(){}

    public LocationRequirements(Integer loc_req_id, Integer light_id, Integer crop_type_id) {
        super();
        this.loc_req_id = loc_req_id;
        this.light_id = light_id;
        this.crop_type_id = crop_type_id;
    }


    //Getter and Setter
    public Integer getLoc_req_id() {
        return loc_req_id;
    }

    public void setLoc_req_id(Integer loc_req_id) {
        this.loc_req_id = loc_req_id;
    }

    public Integer getLight_id() {
        return light_id;
    }

    public void setLight_id(Integer light_id) {
        this.light_id = light_id;
    }

    public Integer getCrop_type_id() {
        return crop_type_id;
    }

    public void setCrop_type_id(Integer crop_type_id) {
        this.crop_type_id = crop_type_id;
    }


}
