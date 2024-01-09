package org.example.good.I;

import org.example.good.I.DAO.LoginDAO;
import org.example.good.I.DTO.LoginDTO;
import org.example.good.I.DTO.RegistrationDTO;
import org.example.good.I.Service.ResetPasswordService;
import org.example.good.I.Service.UserLoginService;
import org.example.good.I.Service.UserRegistrationService;

public class Main {
    public static void main(String[] args){
        LoginDTO loginDTO = null;
        LoginDAO loginDAO = new LoginDAO();

//        Register new user
        UserRegistrationService registerUser = new UserRegistrationService();
        RegistrationDTO user = registerUser.userRegistration();
        System.out.println();
        System.out.println("Details of new user registered are");
        System.out.println(user.getFirstName()+" "+user.getLastName()+","+user.getEmail()+","+user.getNewPassword()+"," +
                user.getSecurityQuestion1()+","+user.getAnswer1());

//        Performing the login for the same user
        loginDTO = new LoginDTO(user.getEmail(),user.getNewPassword(),user.getSecurityQuestion1(),user.getAnswer1());
        loginDAO.addNewLogin(loginDTO);

        System.out.println();

//        Checking user login
        System.out.println("Performing user login");
        UserLoginService login = new UserLoginService(loginDTO,loginDAO);
        login.userLogin();

        System.out.println();
//        Password reset
        System.out.println("Performing user password reset");
        ResetPasswordService resetPassword = new ResetPasswordService(loginDTO,loginDAO,"newExamplePassword");
        resetPassword.resetPassword();
    }
}
