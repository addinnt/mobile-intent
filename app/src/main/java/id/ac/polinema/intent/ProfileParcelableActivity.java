package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);
        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            User user = extras.getParcelable(ParcelableActivity.USER_KEY);

            usernameText.setText(user.getUsername());
            nameText.setText(user.getName());
            ageText.setText(String.valueOf(user.getAge()));

            // TODO: display value here
        }
    }
}
