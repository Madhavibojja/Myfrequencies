package in.visiontek.myfrequencies;

import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private TextView frequencyTextView,maxCpuFreqTextView;
    private Retrofit retrofit;
    private FrequencyApiService apiService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("OnCreate ");
        TextView deviceInfoTextView = findViewById(R.id.cpuFrequencyRangeTextView);

        StringBuilder deviceInfo = new StringBuilder();
        deviceInfo.append("SERIAL: ").append(Build.SERIAL).append("\n");
        deviceInfo.append("MODEL: ").append(Build.MODEL).append("\n");
        deviceInfo.append("ID: ").append(Build.ID).append("\n");
        deviceInfo.append("Manufacture: ").append(Build.MANUFACTURER).append("\n");
        deviceInfo.append("brand: ").append(Build.BRAND).append("\n");
        deviceInfo.append("type: ").append(Build.TYPE).append("\n");
        deviceInfo.append("user: ").append(Build.USER).append("\n");
        deviceInfo.append("BASE: ").append(Build.VERSION_CODES.BASE).append("\n");
        deviceInfo.append("INCREMENTAL: ").append(Build.VERSION.INCREMENTAL).append("\n");
        deviceInfo.append("SDK: ").append(Build.VERSION.SDK).append("\n");
        deviceInfo.append("BOARD: ").append(Build.BOARD).append("\n");
        deviceInfo.append("HOST: ").append(Build.HOST).append("\n");
        deviceInfo.append("FINGERPRINT: ").append(Build.FINGERPRINT).append("\n");
        deviceInfo.append("Version Code: ").append(Build.VERSION.RELEASE);

        deviceInfoTextView.setText(deviceInfo.toString());
    }
     /*   frequencyTextView = findViewById(R.id.cpuFrequencyRangeTextView);

        // Retrieve the min and max CPU frequencies
        long minCpuFreqKHz = getMinCpuFrequencyKHz();
        long maxCpuFreqKHz = getMaxCpuFrequencyKHz();

        double minCpuFreqGHz = minCpuFreqKHz / 1000000.0;
        double maxCpuFreqGHz = maxCpuFreqKHz / 1000000.0;

        // Display the CPU frequency range in the TextView
        String frequencyRangeText = String.format("CPU Frequency Range:\nMin: %.2f GHz\nMax: %.2f GHz", minCpuFreqGHz, maxCpuFreqGHz);
        frequencyTextView.setText(frequencyRangeText);

        // Print the CPU frequency range to the Logcat
        Log.d("CpuFrequencyRange", "Min CPU Frequency: " + minCpuFreqGHz + " GHz");
        Log.d("CpuFrequencyRange", "Max CPU Frequency: " + maxCpuFreqGHz + " GHz");
    }

    private long getMinCpuFrequencyKHz() {
        return Long.parseLong(Utils.readFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"));
    }

    private long getMaxCpuFrequencyKHz() {
        return Long.parseLong(Utils.readFile("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"));
    }

    public static class Utils {
        public static String readFile(String filePath) {
            StringBuilder result = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result.toString().trim();
        }
    }*/
}

       /* maxCpuFreqTextView = findViewById(R.id.frequencyTextView);

        long maxCpuFreqKHz = getMaxCpuFrequencyKHz();

        double maxCpuFreqGHz = maxCpuFreqKHz / 1000000.0;

        maxCpuFreqTextView.setText(String.format("Max CPU Frequency: %.2f GHz", maxCpuFreqGHz));
    }

    private long getMaxCpuFrequencyKHz() {
        long maxFreq = 0;
        try {
            String[] cpuFreqPaths = {
                    "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq",
                    "/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq"
            };

            for (String cpuFreqPath : cpuFreqPaths) {
                String freqStr = Utils.readFile(cpuFreqPath);
                if (freqStr != null) {
                    long freq = Long.parseLong(freqStr);
                    if (freq > maxFreq) {
                        maxFreq = freq;
                    }
                }
            }
        } catch (Exception e) {
            Log.e("CPU", "Error reading max CPU frequency: " + e.getMessage());
        }

        return maxFreq;
    }

    public static class Utils {
        public static String readFile(String filePath) {
            StringBuilder result = new StringBuilder();
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    result.append(line).append("\n");
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result.toString().trim();
        }
    }
*/



        /*frequencyTextView = findViewById(R.id.frequencyTextView);

        // Retrofit setup
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.example.com/") // Replace with your API base URL
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        apiService = retrofit.create(FrequencyApiService.class);

        fetchFrequencies();
    }

    private void fetchFrequencies() {
        Call<List<String>> call = apiService.getFrequencies();
        call.enqueue(new Callback<List<String>>() {
            @Override
            public void onResponse(Call<List<String>> call, Response<List<String>> response) {
                if (response.isSuccessful()) {
                    List<String> frequencies = response.body();

                    if (frequencies != null && !frequencies.isEmpty()) {
                        StringBuilder frequencyNames = new StringBuilder();
                        for (String frequency : frequencies) {
                            frequencyNames.append(frequency).append("\n");
                        }
                        frequencyTextView.setText(frequencyNames.toString());
                    } else {
                        Log.e("API", "Empty response or no frequencies");
                    }
                } else {
                    Log.e("API", "Response not successful: " + response.code());
                }
            }

            @Override
            public void onFailure(Call<List<String>> call, Throwable t) {
                // Handle failure
            }
        });
    }

*/

