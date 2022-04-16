package com.example.riyac.downloadmanager;

import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button button, button2;
    DownloadManager downloadManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                downloadManager=(DownloadManager)getSystemService(DOWNLOAD_SERVICE);
                DownloadManager.Request request=new DownloadManager.Request(Uri.parse("https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwi81cTer_riAhXOiHAKHc5xDvAQjRx6BAgBEAU&url=https%3A%2F%2Fwww.cartoonnetworkindia.com%2F&psig=AOvVaw2ni3_SsjlGzxHMbKCl81n-&ust=1561199317387185"));
                downloadManager.enqueue(request);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent();
                intent.setAction(downloadManager.ACTION_VIEW_DOWNLOADS);
                startActivity(intent);
            }
        });
    }
}
