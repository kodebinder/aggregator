package com.company.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class Checker implements Serializable {

    private String loginId;
    private String name;
}
