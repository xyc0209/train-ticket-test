package travel.repository;

import com.septemberhx.mclient.annotation.Loggable;
import edu.fudan.common.entity.TripId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import travel.entity.Trip;

import java.util.ArrayList;

/**
 * @author fdse
 */
@Repository
public interface TripRepository extends CrudRepository<Trip, TripId> {
    @Loggable
    Trip findByTripId(TripId tripId);
    @Loggable
    void deleteByTripId(TripId tripId);

    @Override
    @Loggable
    ArrayList<Trip> findAll();
    @Loggable
    ArrayList<Trip> findByRouteId(String routeId);
}