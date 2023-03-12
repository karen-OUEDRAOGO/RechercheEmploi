//DAO signifie "Data Access Object"
//utilisé pour accéder à des données stockées dans une base de données.
package sn.esmt.emploi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.esmt.emploi.entities.EmploiEntity;


//cette annotation marque la classe AppUserRepository comme étant un composant de la couche DAO.
@Repository
//l'interface AppUserRepository qui étend la classe JpaRepository
public interface AppUserRepository extends JpaRepository<EmploiEntity,Integer> {
    //EmploiEntity findById(int id);
    //EmploiEntity findByEmailAndPassword(String email, String password);

}

