package com.company.api;

import lombok.Data;

import java.io.Serializable;

@Data
public class StemResponse implements Serializable {

    private boolean success;
    private String message;
}
