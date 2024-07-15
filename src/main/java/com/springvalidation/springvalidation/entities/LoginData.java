package com.springvalidation.springvalidation.entities;

import jakarta.validation.constraints.AssertTrue;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class LoginData {

    @NotBlank(message = "Username can not be empty")
    @Size(min = 5, max = 15, message = "Username must be between 5 - 15 characters")
    private String username;

    @Pattern(regexp = "^[a-zA-Z0-9_.±]+@[a-zA-Z0-9-]+.[a-zA-Z0-9-.]+$", message = "Invalid email")
    private String email;

    @AssertTrue
    private boolean agreed;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAgreed() {
        return agreed;
    }

    public void setAgreed(boolean agreed) {
        this.agreed = agreed;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LoginData{");
        sb.append("username=").append(username);
        sb.append(", email=").append(email);
        sb.append('}');
        return sb.toString();
    }

}
