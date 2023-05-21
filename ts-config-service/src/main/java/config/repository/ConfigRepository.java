package config.repository;

import com.septemberhx.mclient.annotation.Loggable;
import config.entity.Config;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author fdse
 */
public interface ConfigRepository extends CrudRepository<Config, String> {

    /**
     * find by name
     *
     * @param name name
     * @return Config
     */
    @Loggable
    Config findByName(String name);

    /**
     * find all
     *
     * @return List<Config>
     */
    @Override
    @Loggable
    List<Config> findAll();

    /**
     * delete by name
     *
     * @param name name
     * @return null
     */
    @Loggable
    void deleteByName(String name);
}
