package domain2;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "MOVIE_TMP")
public class Movie extends Goods {

    private String director;
    private String actor;
}
