package com.xarath.mydalily;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.util.StringTokenizer;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TV_Result = (TextView) findViewById(R.id.TXT_Result);
    }

    TextView TV_Result;

    public void OnClick(View view) {
        String text = ((Button) view).getText().toString();
        if (text.equals("C")) {
            ClearAll();
            return;
        }
        if (text.equals("=")) {
            Count();
            return;
        }

        if (Check()) TV_Result.setText(TV_Result.getText() + text);
   /*     Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();*/

    }

    boolean Check() {
//      String text=  TV_Result.getText().toString();
//
//        StringTokenizer st = new StringTokenizer(text, "+-*/");
//        while(st.hasMoreElements()){
//            System.out.println("Token:" + st.nextToken());
//        }

        return true;
    }

    void Count() {
    }

    void ClearAll() {
    }
}
