package takutaku.app.albumex

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import takutaku.app.albumex.databinding.ActivityFinalBinding
import takutaku.app.albumex.databinding.ActivityMainBinding

class FinalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityFinalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinalBinding.inflate(layoutInflater).apply{ setContentView(this.root) }

        val imageId = intent.getIntExtra("image",0)

        val displayTitle = intent.getStringExtra("text")

        binding.previewImage.setImageResource(imageId)

        binding.titleText.text = displayTitle

        binding.backButton.setOnClickListener {
            finish()
        }
    }
}