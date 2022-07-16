package takutaku.app.albumex

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import takutaku.app.albumex.databinding.ActivityPreviewBinding

class PreviewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPreviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPreviewBinding.inflate(layoutInflater).apply{ setContentView(this.root) }

        val imageId1 = intent.getIntExtra("image1",0)
        val imageId2 = intent.getIntExtra("image2",0)

        val displayTitle1 = intent.getStringExtra("text1")
        val displayTitle2 = intent.getStringExtra("text2")

        val activityFinalIntent = Intent(this,FinalActivity::class.java)

        binding.albumImageNext1.setImageResource(imageId1)
        binding.albumImageNext2.setImageResource(imageId2)


        binding.albumImageNext1.setOnClickListener {
            activityFinalIntent.putExtra("image",imageId1)
            activityFinalIntent.putExtra("text",displayTitle1)
            startActivity(activityFinalIntent)
        }

        binding.albumImageNext2.setOnClickListener {
            activityFinalIntent.putExtra("image",imageId2)
            activityFinalIntent.putExtra("text",displayTitle2)
            startActivity(activityFinalIntent)
        }

        binding.breakButton.setOnClickListener {
            finish()
        }


    }
}