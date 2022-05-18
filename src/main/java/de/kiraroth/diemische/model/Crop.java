package de.kiraroth.diemische.model;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="crops")
public class Crop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="crop_id")
    private Long crop_id;

    @Column(name="crop_name")
    private String crop_name;

    @Column(name="crop_bottom_grain")
    private String crop_bottom_grain;

    @Column(name="crop_root")
    private String crop_root;

    @Column(name="crop_nutrient_requirements")
    private String crop_nutrient_requirements;

    //Kalle: wrong typo in database: "crop_familiy"
    @Column(name="crop_familiy")
    private String crop_family;

    @Column(name="crop_usage")
    private String crop_usage;

    @OneToMany(mappedBy = "crops", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<CropType> types = new HashSet<>();

    //@OneToMany(mappedBy = "crops")
    //private Set<PosCropRotation> posCropRotations = new HashSet<>();

    //@OneToMany(mappedBy = "crops")
    //private Set<NegCropRotation> negCropRotations = new HashSet<>();

    //@OneToMany(mappedBy = "crops")
    //private Set<PosPolyCultivation> pos_polycultivations = new HashSet<>();

    //@OneToMany(mappedBy = "crops")
    //private Set<NegPolyCultivation> neg_polycultivations = new HashSet<>();

    public Crop() {
    }

    public Crop(Long crop_id, String crop_name, String crop_bottom_grain, String crop_root, String crop_nutrient_requirements, String crop_family, String crop_usage) {
        super();
        this.crop_id = crop_id;
        this.crop_name = crop_name;
        this.crop_bottom_grain = crop_bottom_grain;
        this.crop_root = crop_root;
        this.crop_nutrient_requirements = crop_nutrient_requirements;
        this.crop_family = crop_family;
        this.crop_usage = crop_usage;
    }

    public Long getCrop_id() {
        return crop_id;
    }

    public void setCrop_id(Long crop_id) {
        this.crop_id = crop_id;
    }

    public String getCrop_name() {
        return crop_name;
    }

    public void setCrop_name(String crop_name) {
        this.crop_name = crop_name;
    }

    public String getCrop_bottom_grain() {
        return crop_bottom_grain;
    }

    public void setCrop_bottom_grain(String crop_bottom_grain) {
        this.crop_bottom_grain = crop_bottom_grain;
    }

    public String getCrop_root() {
        return crop_root;
    }

    public void setCrop_root(String crop_root) {
        this.crop_root = crop_root;
    }

    public String getCrop_nutrient_requirements() {
        return crop_nutrient_requirements;
    }

    public void setCrop_nutrient_requirements(String crop_nutrient_requirements) {
        this.crop_nutrient_requirements = crop_nutrient_requirements;
    }

    public String getCrop_family() {
        return crop_family;
    }

    public void setCrop_family(String crop_family) {
        this.crop_family = crop_family;
    }

    public String getCrop_usage() {
        return crop_usage;
    }

    public void setCrop_usage(String crop_usage) {
        this.crop_usage = crop_usage;
    }
}
