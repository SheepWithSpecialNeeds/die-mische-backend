package de.kiraroth.diemische.model;


import javax.persistence.*;

@Entity
@Table(name="month")
public class Month {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="month_id")
    private Integer month_id;

    @Column(name="month_name")
    private String month_name;

    //Constructor
    public Month(){}

    public Month(Integer month_id, String month_name) {
        super();
        this.month_id = month_id;
        this.month_name = month_name;
    }

    //Getter and Setter
    public Integer getMonth_id() {
        return month_id;
    }

    public void setMonth_id(Integer month_id) {
        this.month_id = month_id;
    }

    public String getMonth_name() {
        return month_name;
    }

    public void setMonth_name(String month_name) {
        this.month_name = month_name;
    }
}
