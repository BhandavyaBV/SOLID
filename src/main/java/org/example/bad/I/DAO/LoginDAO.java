package org.example.bad.I.DAO;

import org.example.bad.I.DTO.LoginDTO;

import java.util.ArrayList;

public class LoginDAO {

    ArrayList<LoginDTO> list = new ArrayList<LoginDTO>();

    public void addNewLogin(LoginDTO newLogin){
        list.add(newLogin);
    }

    public ArrayList<LoginDTO> returnUsers(){
        return list;
    }

    public boolean updateList(ArrayList<LoginDTO> list1){
        list = list1;
        for(LoginDTO loginDTO : list){
            System.out.println(loginDTO.getEmail()+" : "+loginDTO.getPassword());
        }
        return true;
    }

}
