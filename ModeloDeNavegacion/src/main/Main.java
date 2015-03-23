/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import model.User;
import view.home.Home;
import view.login.Login;

/**
 *
 * @author garciparedes
 */
public class Main {
    
    public static Login loginStateMachine; 
    public static Home homeStateMachine;
    
    public static ArrayList<User> mUsersList;
    
    public static void main(String args[]) {
        
        try {
            // Set System L&F
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException e) {
           // handle exception
        }
        catch (ClassNotFoundException e) {
           // handle exception
        }
        catch (InstantiationException e) {
           // handle exception
        }
        catch (IllegalAccessException e) {
           // handle exception
        }
        
        mUsersList= new ArrayList<User>();
        mUsersList.add(new User("pedro", "1234", "usuario"));
        
        loginStateMachine = new Login();
    }
    public static Login getStateMachineLogin() {
        return loginStateMachine; 
    }
    
    public static void loginSucceed(User usuario) { 
        
        loginStateMachine.close();
        homeStateMachine = new Home(usuario);
    }
    public static void volverLogin(){
        loginStateMachine.show();
    }
    
    
    public static Home getStateMachineHome() {
        return homeStateMachine; 
    }
}
