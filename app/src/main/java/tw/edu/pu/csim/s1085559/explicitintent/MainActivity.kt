package tw.edu.pu.csim.s1085559.explicitintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBack.setOnClickListener(object: View.OnClickListener{
            override fun oncreate(p0: View?){
                intent = Intent(this@MainActivity,SecondActivity::class.java).apply {
                    putExtra("website", edt.text.toString())
                }

                startActivity(intent)

            }
        })
    }
}