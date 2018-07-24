package applocation.com.br.applocationandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    APIInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface = ApiClient.getClient().create(APIInterface.class);

        Call<List<Position>> call = apiInterface.getPositions();

        Position position = new Position();
        position.setLatitude((float)-19.945972);
        position.setLatitude((float)-43.957167);
        position.setData(new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime()));
        Call<Position> call2 = apiInterface.createPosition(position);

        call2.enqueue(new Callback<Position>() {
                          @Override
                          public void onResponse(Call<Position> call, Response<Position> response) {

                              Log.d("TAG",response.body().toString());
                          }

                          @Override
                          public void onFailure(Call<Position> call, Throwable t) {

                          }
                      });

                call.enqueue(new Callback<List<Position>>() {
                    @Override
                    public void onResponse(Call<List<Position>> call, Response<List<Position>> response) {
                        Log.d("TAG", response.body().toString());
                        List<Position> positions = response.body();
                    }

                    @Override
                    public void onFailure(Call<List<Position>> call, Throwable t) {

                    }
                });
    }
}
