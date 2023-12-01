import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadZone;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStartZone() {
        return startZone;
    }

    public void setStartZone(TransportZone startZone) {
        this.startZone = startZone.getId();
    }
}
