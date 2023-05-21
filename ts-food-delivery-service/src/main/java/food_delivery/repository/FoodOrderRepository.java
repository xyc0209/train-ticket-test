package food_delivery.repository;

import com.septemberhx.mclient.annotation.Loggable;

import food_delivery.entity.FoodOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FoodOrderRepository extends CrudRepository<FoodOrder, String> {

    @Override
    @Loggable
    FoodOrder save(FoodOrder s);

    @Loggable
    Optional<FoodOrder> findById(String id);
}
