package domain2;

import javax.persistence.*;

@Entity
public class Child {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne
    @JoinColumn(name = "PARENT_ID")
    private Parent parent;

    public void setName(String name) {
        this.name = name;
    }

    public void setParent(Parent parent) {
        this.parent = parent;
    }
}
