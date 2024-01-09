package org.example.good.I.Service;

import org.example.good.I.DTO.RegistrationDTO;

public class UserRegistrationService implements IUserRegistrationInterface{

    @Override
    public RegistrationDTO userRegistration() {
        System.out.println("Performing user registration for new user");
        String firstName = "John";
        String lastName = "Doe";
        String phone = "1234567828";
        String email = "john.doe@gmail.com";
        String password = "examplePassword";
        String confirmPassword = "examplePassword";
        String securityQuestion = "City";
        String answer = "Halifax";

        RegistrationDTO newUser = null;
        if(firstName.length()<=1 && lastName.length()<=1){
            System.out.println("First name and last name too short");
            return newUser;
        }
        else if(phone.length()!=10){
            System.out.println("Phone number not valid");
            return newUser;
        }
        else if(!(password.equals(confirmPassword))){
            System.out.println("Passwords do not match");
            return newUser;
        }
        else if(answer.length()==0){
            System.out.println("Please set a security answer");
            return newUser;
        }
        else{
            newUser = new RegistrationDTO(firstName,lastName,email,phone,password,securityQuestion,answer);
            return newUser;
        }
    }
}
