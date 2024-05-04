package My.tamagotchiapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import androidx.activity.enableEdgeToEdge

class MainActivity2 : AppCompatActivity() {
    //declare
    private lateinit var imageView: ImageView
    private lateinit var button: Button
    private lateinit var button2: Button
    private lateinit var button3: Button
    private lateinit var Feedbar:ProgressBar
    private lateinit var Cleanbar:ProgressBar
    private lateinit var Playbar:ProgressBar

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)

    //initialise
    imageView =findViewById(R.id.imageView)
    button =findViewById(R.id.Feedbutton)
    button2 =findViewById(R.id.Cleanbutton)
    button3 =findViewById(R.id.Playbutton)
    Feedbar =findViewById(R.id.Feedbar)
    Cleanbar =findViewById(R.id.Cleanbar)
    Playbar =findViewById(R.id.Playbar)

        // increase the progressbar by 50


        imageView.setImageResource(R.drawable.pa1)

        button.setOnClickListener {
            Feedbar.incrementProgressBy(50)

            imageView.setImageResource(R.drawable.petapp)

        }

      button2.setOnClickListener {
      imageView.setImageResource(R.drawable.pa3)
          Cleanbar.incrementProgressBy(50)


      }

      button3.setOnClickListener {
      imageView.setImageResource(R.drawable.pa2)
       Playbar.incrementProgressBy(50)



      }
    }
}