package order.repository;

import com.septemberhx.mclient.annotation.Loggable;
import order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.UUID;

/**
 * @author fdse
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

    @Override
    @Loggable
    Optional<Order> findById(String id);

    @Override
    @Loggable
    ArrayList<Order> findAll();
    @Loggable
    ArrayList<Order> findByAccountId(String accountId);
    @Loggable
    ArrayList<Order> findByTravelDateAndTrainNumber(String travelDate,String trainNumber);

    @Override
    @Loggable
    void deleteById(String id);
}
