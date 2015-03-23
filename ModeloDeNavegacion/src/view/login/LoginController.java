/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import main.Main;
import model.User;

/**
 *
 * @author garciparedes
 */
public class LoginController {

    LoginWindow logView;
    
    public LoginController(LoginWindow logView) {
 
        this.logView = logView;
    }
    
    private void reset(){
        
        logView.resetPass();
        logView.resetUser();
    }    
    
    public void login(){
        
        String nombre = logView.getNombre();
        char[] passChar = logView.getPass();
        User usu;
        
        String pass = "";
        
        for(int i = 0; i < passChar.length; i++){
            pass += passChar[i];
        }
        
        usu = new User(nombre, pass, "usuario");
        
        for(User u: Main.mUsersList){
            
            if(u.getNombre().equals(usu.getNombre())
                    && u.getPassw().equals(usu.getPassw())){
            
                Main.loginSucceed(usu);
                break;
            }
        }
        
        if(Main.mUsersList.get(0).getNombre().equals(usu.getNombre()) &&
                Main.mUsersList.get(0).getPassw().equals(usu.getPassw())){
            
            Main.loginSucceed(usu);
            
        }
        reset();
        
    }
}
