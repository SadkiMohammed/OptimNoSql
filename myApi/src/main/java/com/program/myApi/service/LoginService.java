package com.program.myApi.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.program.myApi.model.Login;
import com.program.myApi.repository.LoginRepository;

@Service
public class LoginService {

    private final LoginRepository loginRepository;
    public LoginService(LoginRepository loginRepository){
        this.loginRepository = loginRepository;
    }

    public void addLogin(Login login){
        loginRepository.insert(login);
    }

    public void deletLogin(String id){
        loginRepository.deleteById(id);
    }
    
    public List<Login> getLogin(){
        return loginRepository.findAll();
    }

}
