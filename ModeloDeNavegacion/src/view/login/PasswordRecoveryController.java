/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import main.Main;

/**
 *
 * @author adri
 */
public class PasswordRecoveryController {

    PasswordRecoveryWindow window;
    
    public PasswordRecoveryController(PasswordRecoveryWindow window) {
        
        this.window = window;
    }
    
    public void back(){
        Main.loginStateMachine.recoverPassword();
    }
}
