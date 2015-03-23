/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.home;

import main.Main;
import model.User;

/**
 * 
 * @author adri
 */
public class HomeController {

    HomeWindow window;
    
    public HomeController(HomeWindow window, User user) {
        
        this.window = window;
        this.window.setMensajeBievenida("Bienvenido, " + user.getNombre());
    }
    
    public void back(){
        
        window.setVisible(false);
        window.dispose();
        Main.volverLogin();
    }
}
