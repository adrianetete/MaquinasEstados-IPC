/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 * 
 * @author Adrian Calvo Rojo
 * @author Sergio Garcia Praddo
 */
public class User {
    
    
    private String mUsername;
    private String mPassword;
            
    private String mName;
    
    public User(String username, String password, String name){
        this.mUsername = username;
        this.mPassword = password;
        this.mName = name;
    }

    public String getNombre(){
        return this.mUsername;
    }
    public String getPassw(){
        return this.mPassword;
    }
}
