package com.company.auth;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class UserRole {
    private Integer id;
    private String name;
    private List<User> colleagues;
    private Map<String, List<String>> entitlements;
}
