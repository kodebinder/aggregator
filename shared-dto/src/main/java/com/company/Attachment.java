package com.company;

import lombok.Data;

import java.io.Serializable;

@Data
public class Attachment implements Serializable {
    private String id;
    private String refId;
    private String uuid;
    private String absPath;
    private String origName;
    private String dirPath;
}
