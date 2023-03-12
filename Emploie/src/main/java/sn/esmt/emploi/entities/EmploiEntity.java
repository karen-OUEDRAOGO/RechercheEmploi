//Entitiies les entités sont des objets qui représentent des tables dans une base de données.
// les entités sont souvent utilisées en conjonction avec les DAO pour accéder à des données.
package sn.esmt.emploi.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
//?
@Entity
@Table(name="appusers")
public class EmploiEntity {
    @Id//JPA ID est clée primaire
    @Column(length = 150,nullable = false)
    private String nom;
    @Column(length = 100,nullable = false)
    private String prenom;
    @Column(length = 200,nullable = false)
    private int age;
    @Column(length = 200,nullable = false)
    private String adresse;
    @Column(length = 200,nullable = false,unique = true)
    private String email;
    @Column(length = 200,nullable = false)
    private String telephone;
    @Column(length = 200,nullable = false)
    private String specialite;
    @Column(length = 200,nullable = false)
    private String NiveauEtude;
    @Column(length = 200,nullable = false)
    private String experienceProfessionnelle;





}
