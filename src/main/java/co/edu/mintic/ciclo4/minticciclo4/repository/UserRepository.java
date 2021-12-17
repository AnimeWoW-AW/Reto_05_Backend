package co.edu.mintic.ciclo4.minticciclo4.repository;









import co.edu.mintic.ciclo4.minticciclo4.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * Main
 */
public interface UserRepository extends MongoRepository<User, String> {

    /**
     * Filter id
     * @param id
     * @return
     */
    @Query("{id : { $eq: ?0 }}")
    List<User> getUserById(Integer id);

    /**
     * Filter email
     * @param email
     * @return
     */
    @Query("{email : { $eq: ?0 }}")
    List<User> getUserByEmail(String email);

    /**
     * Filter email and password
     * @param email
     * @param password
     * @return
     */
    @Query("{email :{ $eq: ?0 }, password :{ $eq: ?1 }}")
    Optional<User> getUserByEmailAndPassword(String email, String password);

    /**
     * Filter monthBirthDay
     * @param monthBirthtDay
     * @return
     */
    @Query("{monthBirthtDay :{ $eq: ?0 }}")
    List<User> birthtDayList(String monthBirthtDay);
}
