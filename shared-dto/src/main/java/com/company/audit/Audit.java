package com.company.audit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class Audit implements Serializable {

    @JsonProperty("who")
    private String who;

    @JsonProperty("when")
    private String when;

    @JsonProperty("what")
    private String what;
}
