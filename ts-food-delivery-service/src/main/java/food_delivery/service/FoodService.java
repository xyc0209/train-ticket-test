package food_delivery.service;

import com.mbs.mclient.annotation.Loggable;

import edu.fudan.common.util.Response;
import food_delivery.entity.FoodDeliveryOrder;
import food_delivery.entity.FoodOrder;
import org.springframework.http.HttpHeaders;

import java.util.List;


public interface FoodService {
    @Loggable
    Response modifyFoodOrder(FoodDeliveryOrder fo);

    @Loggable
    FoodOrder findByOrderId(String orderId);


}
