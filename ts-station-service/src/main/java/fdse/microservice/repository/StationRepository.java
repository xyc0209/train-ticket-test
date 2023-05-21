package fdse.microservice.repository;

import com.septemberhx.mclient.annotation.Loggable;
import fdse.microservice.entity.Station;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StationRepository extends CrudRepository<Station,String> {

    Station findByName(String name);
    @Loggable
    @Query(value="SELECT * from station where name in ?1", nativeQuery = true)
    List<Station> findByNames(List<String> names);
    @Loggable
    Optional<Station> findById(String id);
    @Loggable
    @Override
    List<Station> findAll();
}
