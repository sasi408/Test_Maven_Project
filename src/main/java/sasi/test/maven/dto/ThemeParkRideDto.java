package sasi.test.maven.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;

@Data
public class ThemeParkRideDto  {
    @NotEmpty
    private String name;
    @NotEmpty
    private String description;
    private int thrillFactor;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getThrillFactor() {
        return thrillFactor;
    }

    public void setThrillFactor(int thrillFactor) {
        this.thrillFactor = thrillFactor;
    }

    public int getVomitFactor() {
        return vomitFactor;
    }

    public void setVomitFactor(int vomitFactor) {
        this.vomitFactor = vomitFactor;
    }

    private int vomitFactor;


    public ThemeParkRideDto(String name, String description, int thrillFactor, int vomitFactor) {
        this.name = name;
        this.description = description;
        this.thrillFactor = thrillFactor;
        this.vomitFactor = vomitFactor;
    }


}
