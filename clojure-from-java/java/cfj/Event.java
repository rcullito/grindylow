package cfj;

import java.util.Date;

public interface Event {

    public Date getTimestamp();

    public String getName();

    public Boolean isPositive(Double angle);
}
