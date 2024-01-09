package org.example.good.I.DTO;

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

    public void setSecurityQuestion1(String securityQuestion1) {
        this.securityQuestion1 = securityQuestion1;
    }

    public void setAnswer1(String answer1) {
        this.answer1 = answer1;
    }

    public String getSecurityQuestion1() {
        return securityQuestion1;
    }

    public String getAnswer1() {
        return answer1;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
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
