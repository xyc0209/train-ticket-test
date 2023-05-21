package user.repository;



import com.septemberhx.mclient.annotation.Loggable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import user.entity.User;

import java.util.List;
import java.util.UUID;

/**
 * @author fdse
 */
@Repository
public interface UserRepository extends CrudRepository<User, String> {
    @Loggable
    User findByUserName(String userName);
    @Loggable
    User findByUserId(String userId);
    @Loggable
    void deleteByUserId(String userId);
    @Override
    @Loggable
    List<User> findAll();
}
