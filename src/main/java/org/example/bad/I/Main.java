package org.example.bad.I;

import org.example.bad.I.DAO.LoginDAO;
import org.example.bad.I.DTO.LoginDTO;
import org.example.bad.I.DTO.RegistrationDTO;
import org.example.bad.I.Service.LoginService;
import org.example.bad.I.Service.RegistrationService;
import org.example.bad.I.Service.ResetPasswordService;

public class Main {
    public static void main(String[] args){

        LoginDTO loginDTO = null;
        LoginDAO loginDao = new LoginDAO();


//        Registering new User
        RegistrationService registerUser = new RegistrationService();
        RegistrationDTO user = registerUser.userRegistration();
        System.out.println("Details of new user registered");
        System.out.println(user.getFirstName()+" "+user.getLastName()+" , "+user.getNewPassword()+","+user.getEmail()+"," +
                user.getPhone());

//        Adding user to login
        loginDTO = new LoginDTO(user.getEmail(),user.getNewPassword(),user.getSecurityQuestion1(),user.getAnswer1());
        loginDao.addNewLogin(loginDTO);

        System.out.println();

//        Checking user by using login credentails
        System.out.println("Performing logging operations for the same user");
        LoginService loginService = new LoginService(user.getEmail(), user.getNewPassword(),loginDao);
        loginService.userLogin();

        System.out.println();

//      Resetting the password
        System.out.println("Performing the reset password");
        ResetPasswordService resetPasswordService = new ResetPasswordService(user.getEmail(), user.getNewPassword(), user.getSecurityQuestion1(),
                user.getAnswer1(),loginDao, "newExamplePassword");
        resetPasswordService.resetPassword();

    }
}
