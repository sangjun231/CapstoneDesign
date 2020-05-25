package kjharu.com.capstone_2020

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        print("Hi");
        setContentView(R.layout.activity_main)
    }
}
