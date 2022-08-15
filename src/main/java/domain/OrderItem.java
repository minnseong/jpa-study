package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import static javax.persistence.FetchType.*;

@Entity
@Setter
@Getter
public class OrderItem {

    public OrderItem() {
    }

    @Id
    @GeneratedValue
    @Column(name = "ORDER_ITEM_ID")
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ORDER_ID")
    private Order order;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "ITEM_ID")
    private Item item;

    private int orderPrice;
    private int count;
}
