package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "CATEGORY_ITEM")
@Setter
@Getter
public class CategoryItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "GATEGORY_ID")
    private Category categories;

    @ManyToOne
    @JoinColumn(name = "ITEM_ID")
    private Item items;
}
