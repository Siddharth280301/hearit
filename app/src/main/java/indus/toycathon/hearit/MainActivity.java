package indus.toycathon.hearit;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button arBtn = (Button)findViewById(R.id.arBtn);
        Button lensBtn = (Button)findViewById(R.id.lensBtn);

        // on AR button clicked
        arBtn.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "AR button clicked.", Toast.LENGTH_SHORT).show();
        });

        //on Lens button clicked
        lensBtn.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Lens button clicked.", Toast.LENGTH_SHORT).show();
        });
    }
}