package sn.esmt.emploi.ws;

//Importation des classes et interfaces nécessaires pour le fichier source.
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import sn.esmt.emploi.dao.AppUserRepository;
import sn.esmt.emploi.entities.EmploiEntity;

import java.util.List;

//@RestController:indique que la classe est un contrôleur
@RestController
//spécifie le chemin de base pour toutes les requêtes HTTP associées aux utilisateurs.
@RequestMapping(value = "/users")
//annotation de Lombok qui permet de générer
// un constructeur avec tous les champs d'une classe
@AllArgsConstructor
//la classe AppUserController, qui est un contrôleur
// pour les requêtes HTTP associées aux utilisateurs de l'application.
public class AppUserController {
    private AppUserRepository appUserRepository;

    //spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP POST est envoyée à l'URL /users/save.
    @PostMapping(path = "/save")//POST REQUEST
    //@RequestBody indique que les données de la requête HTTP
    // doivent être converties en un objet AppUserEntity
    public EmploiEntity save(@RequestBody EmploiEntity appUserEntity){
        return appUserRepository.save(appUserEntity);
    }
    //************************************************************************************
    //spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP GET est envoyée à l'URL /users/alls
    @GetMapping(path = "/all")
    public List<EmploiEntity> getAll(){
        return appUserRepository.findAll();
    }
    //************************************************************************************
    // spécifie que cette méthode doit être appelée
    // lorsqu'une requête HTTP GET est envoyée à l'URL /users/login

/*
    @GetMapping(path = "/login")//GET REQUEST: "login" est un point d'entrée HTTP GET pour l'URI "/login".
    //Cette méthode prend deux paramètres email et password,
    // qui sont extraits de la requête HTTP en utilisant l'annotation @RequestParam
    public ApiLoginResponse login(@RequestParam String email,@RequestParam String password){
        //appelle la méthode "findByEmailAndPassword" de la classe "AppUserRepository" pour trouver l'utilisateur
        // ayant l'adresse e-mail et le mot de passe correspondant aux paramètres de requête "email" et "password".
        EmploiEntity appUserEntity = appUserRepository.findByEmailAndPassword(email, password);
        if(appUserEntity != null){
            //signifie qu'un utilisateur correspondant aux informations d'identification a été trouvé.
            //une connexion réussie et l'adresse e-mail de l'utilisateur.
            return new ApiLoginResponse("OK",email);
        }else{
            //signifie aucun utilisateur correspondant n'a été trouvé
            //connexion sans resultat...
            return new ApiLoginResponse("NOK",email);
        }
    }

 */
}
