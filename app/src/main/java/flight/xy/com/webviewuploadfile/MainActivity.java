package flight.xy.com.webviewuploadfile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity  {

    //private Button mBtn;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent = new Intent(MainActivity.this,WebViewActivity.class);
        startActivity(intent);
//        webView = (WebView) findViewById(R.id.web_view);
//        webView.setWebChromeClient(new WebViewActivity(this));

    //    initView();
    //    initListener();
    }

//    private void initView() {
//        mBtn = (Button) findViewById(R.id.main_btn);
//    }

//    private void initListener() {
//        mBtn.setOnClickListener(this);
//    }

//    @Override
//    public void onClick(View v) {
//        int viewId = v.getId();
//        if (viewId == R.id.main_btn) {
////            String loadUrl = mLoadEdit.getText().toString();
//            String loadUrl = "http://rztit.com:3000";
////            if (TextUtils.isEmpty(loadUrl)) {
////                loadUrl = mLoadEdit.getHint().toString();
////            }
//            Intent intent = new Intent();
//            intent.setClass(MainActivity.this, WebViewActivity.class);
//            intent.putExtra("load_url", loadUrl);
//            startActivity(intent);
//        }
//    }
}
