package applocation.com.br.applocationandroid;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by andre.coelho on 24/07/2018.
 */

public interface APIInterface {

    @POST("/position/insertPosition")
    Call<Position> createPosition(@Body Position user);

    @GET("/position/getLastPosition")
    Call<List<Position>> getPositions();

    @GET("/")
    Call<String> getIndex();
}
