package devandroid.gomes.weddinglist.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import devandroid.gomes.weddinglist.R;
import devandroid.gomes.weddinglist.model.Guest;

public class MainActivity extends AppCompatActivity {

    // Instance new Guest
    Guest guest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create a new Guest
        guest = new Guest();
    }

}