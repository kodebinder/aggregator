package com.company.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@JsonIgnoreProperties
public class ValueDate implements Serializable {

    private Date date;

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
