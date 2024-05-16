import java.io.Serializable;

public class ReserveSystem implements Serializable {

    int date;
    int count;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}