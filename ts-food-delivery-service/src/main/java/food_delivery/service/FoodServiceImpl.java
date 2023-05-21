package food_delivery.service;

import edu.fudan.common.entity.Food;

import edu.fudan.common.entity.Route;
import edu.fudan.common.entity.StationFoodStore;
import edu.fudan.common.util.JsonUtils;
import edu.fudan.common.util.Response;
import food_delivery.entity.FoodDeliveryOrder;
import food_delivery.entity.FoodOrder;
import food_delivery.repository.FoodOrderRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private FoodOrderRepository foodOrderRepository;
    @Override
    public Response modifyFoodOrder(FoodDeliveryOrder fo) {
        System.out.println("fo.getFoodOrderId()"+fo.getFoodOrderId());
        FoodOrder foodOrder = this.findByOrderId(fo.getFoodOrderId());
        System.out.println(foodOrder.toString());
        foodOrder.setStatus(1);
        foodOrderRepository.save(foodOrder);
        return new Response<>(1, "modify foodOrder status success", null);

    }

    @Override
    public FoodOrder findByOrderId(String orderId) {
        return foodOrderRepository.findById(orderId).get();
    }
}
