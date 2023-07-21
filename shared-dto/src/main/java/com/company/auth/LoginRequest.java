package com.company.auth;

import com.google.gson.Gson;
import lombok.Data;

@Data
public class LoginRequest {

    private String userId;

    private String password;

    private String applicationId;

    @Override
    public String toString(){
        return new Gson().toJson(this);

    }
}
