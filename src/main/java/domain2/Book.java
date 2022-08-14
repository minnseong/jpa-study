package domain2;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BOOK_TMP")
public class Book extends Goods {
    private String author;
    private String isbn;
}
