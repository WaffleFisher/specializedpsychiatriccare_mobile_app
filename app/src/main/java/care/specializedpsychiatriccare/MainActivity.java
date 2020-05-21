package care.specializedpsychiatriccare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button Sch = findViewById(R.id.button9);
        Button Tele = findViewById(R.id.button10);
        Button Test = findViewById(R.id.button13);
        Button Sesame = findViewById(R.id.button11);
        Button Meet  = findViewById(R.id.button2);

        Sch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Schedule.class));
            }
        });
        Meet.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Meet.class));
            }
        });
        Sesame.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://sesamecare.com/provider/david-campopiano-np_3qXN"));
                startActivity(intent);
            }
        });
        Test.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://sites.google.com/view/spctesting/psych-test-1"));
                startActivity(intent);
            }
        });
        Tele.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Tele.class));
            }
        });
    }


}


