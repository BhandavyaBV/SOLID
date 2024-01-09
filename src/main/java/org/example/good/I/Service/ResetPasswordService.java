package org.example.good.I.Service;

import org.example.good.I.DAO.LoginDAO;
import org.example.good.I.DTO.LoginDTO;

import java.util.ArrayList;

public class ResetPasswordService implements IResetPasswordService{
    private LoginDTO loginDTO;
    private LoginDAO loginDAO;
    private String newPassword;

    public ResetPasswordService(LoginDTO loginDTO, LoginDAO loginDAO , String newPassword) {
        this.loginDTO = loginDTO;
        this.loginDAO = loginDAO;
        this.newPassword = newPassword;
    }

    @Override
    public void resetPassword() {
        int count=0;
        ArrayList<LoginDTO> usersList = loginDAO.returnUsers();
        for(LoginDTO loginDto : usersList){
            count = count+1;
            if(loginDto.getPassword().equals(this.loginDTO.getPassword()) && loginDto.getEmail().equals(this.loginDTO.getEmail())
                    && loginDto.getSecurityQuestion().equals(this.loginDTO.getSecurityQuestion()) && loginDto.getAnswer().equals(this.loginDTO.getAnswer())){
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
