package org.example.bad.I.DTO;

import java.util.ArrayList;

public class LoginDTO {

    private String email;
    private String password;
    private String securityQuestion;

    private String answer;



    public LoginDTO(String email, String password , String securityQuestion , String answer) {
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
    }

    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getSecurityQuestion() {
        return securityQuestion;
    }

    public String getAnswer() {
        return answer;
    }


    public void setPassword(String password) {
        this.password = password;
    }

}
