package food.repository;

import com.mbs.mclient.annotation.Loggable;
import food.entity.StationFoodStore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface StationFoodRepository extends CrudRepository<StationFoodStore, String> {

    @Override
    @Loggable
    Optional<StationFoodStore> findById(String id);
    @Loggable
    List<StationFoodStore> findByStationName(String stationName);
    @Loggable
    List<StationFoodStore> findByStationNameIn(List<String> stationNames);


    @Override
    @Loggable
    List<StationFoodStore> findAll();

    @Override
    @Loggable
    void deleteById(String id);
}
