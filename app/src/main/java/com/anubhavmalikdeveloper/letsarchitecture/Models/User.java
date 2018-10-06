package com.anubhavmalikdeveloper.letsarchitecture.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.annotations.SerializedName;

@JsonIgnoreProperties(ignoreUnknown = true)
public class User {
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName("username")
    private String username;
    @SerializedName("email")
    private String email;
    @SerializedName("phone")
    private String phone;
    @SerializedName("website")
    private String website;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsite() {
        return website;
    }
}
