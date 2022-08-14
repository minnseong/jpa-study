package domain2;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ALBUM_TMP")
public class Album extends Goods {

    private String artist;
}
