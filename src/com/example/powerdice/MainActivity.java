package com.example.powerdice;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements OnClickListener{
	ImageView imgc, imgy;
	Button btn;
	TextView txt;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        imgc = (ImageView)findViewById(R.id.imageView1);
        imgy = (ImageView)findViewById(R.id.imageView2);
        btn = (Button)findViewById(R.id.button1);
        txt = (TextView)findViewById(R.id.textView4);
        
        btn.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

	public void onClick(View arg0) {
		int randomc = (int)Math.round(Math.random() * 5);
		int randomy = (int)Math.round(Math.random() * 5);
		
		imgc.setImageResource(R.drawable.dice21 + randomc);
		imgy.setImageResource(R.drawable.dice21 + randomy);
		
		if (randomc > randomy)
			txt.setText("ƒƒ«ª≈∏∞° ¿Ã∞ÂΩø");
		else if (randomy > randomc)
			txt.setText("¥œ∞° ¿Ã±Ë");
		else
			txt.setText("b±Ë");
		// TODO Auto-generated method stub
		
	}
}
