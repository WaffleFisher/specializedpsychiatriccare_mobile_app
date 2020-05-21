package care.specializedpsychiatriccare;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class Schedule extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_schedule);
        Button pay = findViewById(R.id.button5);
        Button email = findViewById(R.id.button4);
        Button intake = findViewById(R.id.button3);

        pay.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.specializedpsychiatriccare.com/payment"));
                startActivity(intent);
            }
        });
        email.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"specializedpsychiatriccarellc@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT, "New Patient Referral");
                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(Schedule.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        intake.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.specializedpsychiatriccare.com/intake-form"));
                startActivity(intent);
            }
        });
    }
}
