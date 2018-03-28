package tw.edu.cjcu.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
    }

    private void findViews() {
        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        button2 = findViewById(R.id.button2);
    }

    public void calbml(View view) {
        float w = Float.parseFloat(editText.getText().toString());
        float h = Float.parseFloat(editText2.getText().toString());
        float bmi = w/(h*h);
        Toast.makeText(this, bmi+"", Toast.LENGTH_SHORT).show();
    }
}
