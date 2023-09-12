package foodsearch.repository;

import com.mbs.mclient.annotation.Loggable;
import foodsearch.entity.FoodOrder;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface FoodOrderRepository extends CrudRepository<FoodOrder, String> {
    @Loggable
    Optional<FoodOrder> findById(String id);
    @Loggable
    FoodOrder findByOrderId(String orderId);

    @Override
    @Loggable
    List<FoodOrder> findAll();
    @Loggable
    void deleteById(UUID id);
    @Loggable
    void deleteFoodOrderByOrderId(String id);

}
