package food_delivery.repository;

import com.septemberhx.mclient.annotation.Loggable;
import food_delivery.entity.FoodDeliveryOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface FoodDeliveryOrderRepository extends CrudRepository<FoodDeliveryOrder, String> {
    @Loggable
    List<FoodDeliveryOrder> findByStationFoodStoreId(String stationFoodStoreId);

    @Override
    @Loggable
    List<FoodDeliveryOrder> findAll();

}
