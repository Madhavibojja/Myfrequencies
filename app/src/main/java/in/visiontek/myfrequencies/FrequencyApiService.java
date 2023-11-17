package in.visiontek.myfrequencies;

import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface FrequencyApiService {
    @GET("frequencies")
    Call<List<String>> getFrequencies();
}
