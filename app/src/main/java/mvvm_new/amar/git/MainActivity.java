package mvvm_new.amar.git;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        callFromONCREATE();
    }
    public void callFromONCREATE(){
        Toast.makeText(MainActivity.this,"Git",Toast.LENGTH_LONG).show();
    }
}
