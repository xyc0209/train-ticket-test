package food.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import edu.fudan.common.entity.Food;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Entity
@GenericGenerator(name = "jpa-uuid", strategy = "org.hibernate.id.UUIDGenerator")
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(indexes = {@Index(name = "station_store_idx", columnList = "station_name, store_name", unique = true)})
public class StationFoodStore {

    @Id
    @Column(name = "store_id", length= 50)
    private String id;

    @NotNull
    @Column(name = "station_name",length= 50)
    private String stationName;

    @Column(name = "store_name",length= 50)
    private String storeName;
    @Column(length= 50)
    private String telephone;
    @Column(length= 50)
    private String businessTime;

    private double deliveryFee;

    @ElementCollection(targetClass = Food.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "station_food_list", joinColumns = @JoinColumn(name = "store_id"))
    private List<Food> foodList;

    public StationFoodStore(){
        //Default Constructor
        this.stationName = "";
    }

}
