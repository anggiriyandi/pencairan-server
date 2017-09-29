/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.telkomsigma.pencairanserver;

import id.co.telkomsigma.pencairanserver.model.Ingredient;
import id.co.telkomsigma.pencairanserver.model.Recipe;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author anggi
 */

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PencairanController {
    
    @GetMapping("/hallo")
    public String hallo(){
        return "hallo";
    }
    
    @GetMapping("/getRecipies")
    public List<Recipe> getRecipies(){
        List<Recipe> resipies = new ArrayList<>();
        List<Ingredient> ingredients = new ArrayList<>();
        
        Ingredient i = new Ingredient("Buns", 2);
        ingredients.add(i);
        
        Recipe recipe1 = new Recipe(
                "Tasty", 
                "A super-tasty Schnitzel - just awesome!", 
                "https://upload.wikimedia.org/wikipedia/commons/7/72/Schnitzel.JPG", 
                ingredients);
        
        resipies.add(recipe1);
        return resipies;
    }
}
