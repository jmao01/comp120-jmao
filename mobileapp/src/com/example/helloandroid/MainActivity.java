package com.example.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import org.apache.http.HttpResponse;

public class MainActivity extends Activity implements OnClickListener {

	protected static final String MESSAGES_API_URL = "http://messagehub.herokuapp.com/messages.json";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.form);
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
		PostMessage p = new PostMessage();
		p.execute("testtest", "testtest");
	}
	
	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			Toast.makeText(this, "TOAST", Toast.LENGTH_LONG).show();
		}
	}
}
