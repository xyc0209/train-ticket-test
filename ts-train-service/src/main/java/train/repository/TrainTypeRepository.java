package train.repository;

import com.septemberhx.mclient.annotation.Loggable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import train.entity.TrainType;

import java.util.List;
import java.util.Optional;

@Repository
public interface TrainTypeRepository extends CrudRepository<TrainType,String> {
    @Loggable
    Optional<TrainType> findById(String id);
    @Override
    @Loggable
    List<TrainType> findAll();
    @Loggable
    void deleteById(String id);
    @Loggable
    TrainType findByName(String name);
    @Loggable
    @Query(value="SELECT * from train_type where name in ?1", nativeQuery = true)
    List<TrainType> findByNames(List<String> names);
}
