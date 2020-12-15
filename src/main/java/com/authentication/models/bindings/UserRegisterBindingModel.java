package com.authentication.models.bindings;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

public class UserRegisterBindingModel {

    private String username;
    private String password;
    private String confirmPassword;

    public UserRegisterBindingModel() {
    }

    @NotNull(message = "Username is required.")
    @Length(min = 5,max = 20 , message = "Username must be between 5 and 20 characters.")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NotNull(message = "Password is required")
    @Length(min = 8, max = 16, message = "Password must be between 8 and 16 characters.")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
