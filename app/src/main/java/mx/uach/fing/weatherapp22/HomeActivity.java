package mx.uach.fing.weatherapp22;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.logging.Logger;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Button btnCuu = findViewById(R.id.btnCuu);
        btnCuu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Logger.getLogger("app ->").info("presione un boton");
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                intent.putExtra("CITY", "Chihuahua");
                startActivity(intent);

            }
        });
    }

    public void goToMty(View v){
        Logger.getLogger("app ->").warning("presione mty");
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        intent.putExtra("CITY", "Monterrey");
        startActivity(intent);
    }
}