package takutaku.app.albumex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import takutaku.app.albumex.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply{ setContentView(this.root) }

        val activityPreviewIntent = Intent(this,PreviewActivity::class.java)

        val image = arrayOf(arrayOf(R.drawable.image1,R.drawable.image2), arrayOf(R.drawable.image3,R.drawable.image4))

        val text = arrayOf(arrayOf("サッカー1","サッカー2"), arrayOf("サッカー3","サッカー4"))

        binding.albumImage1.setOnClickListener {
             activityPreviewIntent.putExtra("image1",image[0][0])
            activityPreviewIntent.putExtra("image2",image[0][1])
            activityPreviewIntent.putExtra("text1",text[0][0])
            activityPreviewIntent.putExtra("text2",text[0][1])
            startActivity(activityPreviewIntent)
        }

        binding.albumImage2.setOnClickListener {
            activityPreviewIntent.putExtra("image1",image[1][0])
            activityPreviewIntent.putExtra("image2",image[1][1])
            activityPreviewIntent.putExtra("text1",text[1][0])
            activityPreviewIntent.putExtra("text2",text[1][1])
            startActivity(activityPreviewIntent)
        }

    }
}