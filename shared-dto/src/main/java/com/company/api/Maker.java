package com.company.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Maker implements Serializable {

    private String loginId;
    private String name;
}
