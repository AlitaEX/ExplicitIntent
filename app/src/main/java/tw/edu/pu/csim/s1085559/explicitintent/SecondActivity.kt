package tw.edu.pu.csim.s1085559.explicitintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnBack.setOnClickListener(object: View.OnClickListener{
            override fun onClick(p0: View?) {
                finish()
            }
        })
        override fun onBackPressed(){
            if (webv.canGoBack()){
                webv.goBack()
            }
            else{
                finish()
            }
        }

        val intent = getIntent()
        val website:String? = intent.getStringExtra("website")
        if (website != null){
            // 如果想讓網頁顯示在自己的WebView上
            webv.setWebViewClient(WebViewClient())
            //允許網頁使用JavaScript
            webv.settings.javaScriptEnabled = true


            webv.loadUrl(website)
        }


    }

}