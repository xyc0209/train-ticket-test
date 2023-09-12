package food_delivery.repository;

import com.mbs.mclient.annotation.Loggable;
import food_delivery.entity.FoodDeliveryOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FoodDeliveryOrderRepository extends CrudRepository<FoodDeliveryOrder, String> {
//    @Loggable
    List<FoodDeliveryOrder> findByStationFoodStoreId(String stationFoodStoreId);

    @Override
//    @Loggable
    List<FoodDeliveryOrder> findAll();

}
