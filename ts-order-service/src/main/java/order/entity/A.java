package order.entity;


import order.entity.subentity.G;

import javax.persistence.*;

/**
 * @description:
 * @author: xyc
 * @date: 2023-04-26 16:09
 */
@Entity
public class A {
    private Long id;
    public G g;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

