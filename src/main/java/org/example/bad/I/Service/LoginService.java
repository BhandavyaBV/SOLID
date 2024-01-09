package org.example.bad.I.Service;

import org.example.bad.I.DAO.LoginDAO;
import org.example.bad.I.DTO.LoginDTO;
import org.example.bad.I.DTO.RegistrationDTO;
import org.example.bad.I.Service.IUserAuthentication;

import java.util.ArrayList;

public class LoginService implements IUserAuthentication {
    private String email;
    private String password;

    private LoginDAO loginDAO;


    public LoginService(String email, String password, LoginDAO loginDAO) {
        this.email = email;
        this.password = password;
        this.loginDAO = loginDAO;
    }

    @Override
    public RegistrationDTO userRegistration() {
        return null;

//        No implmentation required here
    }

    @Override
    public void userLogin() {
        int count=0;
        ArrayList<LoginDTO> loginDTOList = this.loginDAO.returnUsers();
        for(LoginDTO loginDTO : loginDTOList){
            if(loginDTO.getEmail().equals(this.email) && loginDTO.getPassword().equals(this.password))
            {
                System.out.println("Login Successful");
                break;
            }
            count=count+1;
        }

        if(count>=loginDTOList.size()){
            throw new SecurityException("Credentials do not match");
        }
    }

    @Override
    public void resetPassword() {
//        No implmentation required here
    }

}
