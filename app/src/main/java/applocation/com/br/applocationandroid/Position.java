package applocation.com.br.applocationandroid;

import java.util.Date;

/**
 * Created by andre.coelho on 24/07/2018.
 */

public class Position {

    private float Latitude;
    private float Longitude;
    private String Data;

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float latitude) {
        Latitude = latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float longitude) {
        Longitude = longitude;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }
}
