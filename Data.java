/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package schoolmanagement;

/**
 *
 * @author OJeSs
 */
public class Data {
    
    private static Integer id;
    private static String surname;
    private static String given;
    private static String gender;
    private static String image;
    
    public Data(Integer id, String surname, String given, String gender, String image){
        
        this.id = id;
        this.surname = surname;
        this.given = given;
        this.gender = gender;
        this.image = image;
    }
    
    public Integer getId(){
        
        return id;
    }
    
    public String getSurname(){
        
        return surname;
    }
    
    public String getGiven(){
        
        return given;
    }
    
    public String getGender(){
        
        return gender;
    }
    
    public String getImage(){
        
        return image;
    }
            
            
    
}
