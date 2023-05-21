package price.repository;

import com.septemberhx.mclient.annotation.Loggable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import price.entity.PriceConfig;
import java.util.List;
import java.util.Optional;

/**
 * @author fdse
 */
@Repository
public interface PriceConfigRepository extends CrudRepository<PriceConfig, String> {

    @Override
    @Loggable
    Optional<PriceConfig> findById(String id);
    @Loggable
    PriceConfig findByRouteIdAndTrainType(String routeId,String trainType);

    @Query(value="SELECT * FROM price_config WHERE route_id IN ?1 AND train_type IN ?2", nativeQuery = true)
    @Loggable
    List<PriceConfig> findByRouteIdsAndTrainTypes(List<String> routeIds, List<String> trainTypes);

    @Override
    @Loggable
    List<PriceConfig> findAll();

}
