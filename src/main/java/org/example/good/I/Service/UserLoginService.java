package org.example.good.I.Service;

import org.example.good.I.DAO.LoginDAO;
import org.example.good.I.DTO.LoginDTO;

import java.util.ArrayList;

public class UserLoginService implements IUserLoginInterface{
    public UserLoginService(LoginDTO user, LoginDAO loginDAO) {
        this.user = user;
        this.loginDAO = loginDAO;
    }

    private LoginDTO user;
    private LoginDAO loginDAO;


    @Override
    public void userLogin() {
        int count=0;
        ArrayList<LoginDTO> loginDTOList = this.loginDAO.returnUsers();
        for(LoginDTO loginDTO : loginDTOList){
            count=count+1;
            if(loginDTO.getEmail().equals(this.user.getEmail()) && loginDTO.getPassword().equals(this.user.getPassword()))
            {
                System.out.println("Login Successful");
            }
        }
        if(count==loginDTOList.size()-1){
            throw new SecurityException("Credentials do not match");
        }
    }
}
