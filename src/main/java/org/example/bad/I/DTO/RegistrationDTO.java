package org.example.bad.I.DTO;

public class RegistrationDTO {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;

    public RegistrationDTO(String firstName, String lastName, String email, String phone, String newPassword, String securityQuestion1, String answer1) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.newPassword = newPassword;
        this.securityQuestion1 = securityQuestion1;
        this.answer1 = answer1;
    }

    private String newPassword;
    private String securityQuestion1;
    private String answer1;

    public String getSecurityQuestion1() {
        return securityQuestion1;
    }

    public String getAnswer1() {
        return answer1;
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getNewPassword() {
        return newPassword;
    }

}
