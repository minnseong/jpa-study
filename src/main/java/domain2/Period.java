package domain2;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class Period {
    private LocalDateTime startDate;
    private LocalDateTime endDate;

}
