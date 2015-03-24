/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.home;

import javax.swing.JFrame;
import model.User;

/**
 * @author Adrian Calvo Rojo
 * @author Sergio Garcia Praddo
 */
public class Home {
    
    private JFrame home;
    
    public Home(final User u){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                home = new HomeWindow(u);
                home.setVisible(true);
            }
        });
    }

}
