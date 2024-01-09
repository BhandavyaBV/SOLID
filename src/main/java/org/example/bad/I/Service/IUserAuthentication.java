package org.example.bad.I.Service;

import org.example.bad.I.DTO.RegistrationDTO;

public interface IUserAuthentication {

    public RegistrationDTO userRegistration();
    public void userLogin();
    public void resetPassword();
}
