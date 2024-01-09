package org.example.bad.I.Service;

import org.example.bad.I.DAO.LoginDAO;
import org.example.bad.I.DTO.LoginDTO;
import org.example.bad.I.DTO.RegistrationDTO;
import org.example.bad.I.Service.IUserAuthentication;

import java.util.ArrayList;

public class ResetPasswordService implements IUserAuthentication {

    private String email;
    private String password;
    private String securityQuestion;
    private String answer;
    private LoginDAO loginDAO;
    private String newPassword;

    public ResetPasswordService(String email, String password, String securityQuestion, String answer , LoginDAO loginDAO , String newPassword) {
        this.email = email;
        this.password = password;
        this.securityQuestion = securityQuestion;
        this.answer = answer;
        this.loginDAO = loginDAO;
        this.newPassword = newPassword;
    }

    @Override
    public RegistrationDTO userRegistration() {
        return null;
//        Implementation not required
    }

    @Override
    public void userLogin() {
//Implmentation not required
    }

    @Override
    public void resetPassword() {
        int count=0;
        ArrayList<LoginDTO> usersList = loginDAO.returnUsers();
        for(LoginDTO loginDto : usersList){
            count = count+1;
            if(loginDto.getPassword().equals(this.password) && loginDto.getEmail().equals(this.email)
            && loginDto.getSecurityQuestion().equals(this.securityQuestion) && loginDto.getAnswer().equals(this.answer)){
                System.out.println("User authentication successful");
                usersList.remove(loginDto);
                loginDto.setPassword(newPassword);
                usersList.add(loginDto);
                loginDAO.updateList(usersList);
                System.out.println("Password reset successful");
                break;
            }
        }
        if(count==usersList.size()-1){
            throw new SecurityException("Authentication failed. Please try again");
        }
    }

}
