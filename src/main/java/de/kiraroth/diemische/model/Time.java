package de.kiraroth.diemische.model;

import javax.persistence.*;

@Entity
@Table(name="time")

public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="time_name")
    private String time_name;

    @Column(name = "time_description")
    private String time_description;

    //Constructors
    public Time() { }

    /**
     * Time class to define the Time of the Month
     * @param time_name
     */
    public Time(String time_name) {
        super();
        this.time_name = time_name;
        this.time_description = time_description;
    }

    //Getter Setter
    public String getName() {
        return time_name;
    }

    public void setName(String name) {
        this.time_name = name;
    }

    public String getTime_description() {
        return time_description;
    }

    public void setTime_description(String time_description) {
        this.time_description = time_description;
    }
}
