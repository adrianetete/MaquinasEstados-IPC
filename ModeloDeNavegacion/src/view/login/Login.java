/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.login;

import javax.swing.JFrame;

/**
 *
 * @author Adrian Calvo Rojo
 * @author Sergio Garcia Praddo
 */
public class Login {
    
    private JFrame currentState;
    
    public Login() {
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new LoginWindow(); 
                currentState.setVisible(true);
            } 
        });
    }
    
    public void restart(){
        currentState.setVisible(false); // si se desea ocultar 
        currentState.dispose(); // si se desea destruir  
        java.awt.EventQueue.invokeLater( 
            new Runnable() {
                public void run() {
                currentState = new LoginWindow(); 
                currentState.setVisible(true);
            } 
        });
    }

    public void recoverPassword() {
        currentState.setVisible(false); // si se desea ocultar 
        currentState.dispose(); // si se desea destruir  
            //realiza transición 
        java.awt.EventQueue.invokeLater(
            new Runnable() { public void run() {
                currentState = new PasswordRecoveryWindow();
                currentState.setVisible(true);
            }
        });
    }
     public void help() {
        currentState.setVisible(false); // si se desea ocultar 
        currentState.dispose(); // si se desea destruir  
            //realiza transición 
        java.awt.EventQueue.invokeLater(
            new Runnable() { public void run() {
                currentState = new HelpWindow();
                currentState.setVisible(true);
            }
        });
    }

    public void close() {
        currentState.setVisible(false);
    }
    public void show(){         
        
        currentState.setVisible(true);
    }
    
}
