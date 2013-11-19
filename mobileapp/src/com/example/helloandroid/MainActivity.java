package com.example.helloandroid;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.EditText;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import org.apache.http.HttpResponse;

public class MainActivity extends Activity implements OnClickListener {

	protected static final String MESSAGES_API_URL = "http://messagehub.herokuapp.com/messages.json";
	EditText msgTextField1;
	EditText msgTextField2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.form);
		msgTextField1 = (EditText) findViewById(R.id.editText1);
		msgTextField2 = (EditText) findViewById(R.id.editText2);
		Button btn1 = (Button) findViewById(R.id.button1);
		btn1.setOnClickListener(this);
	}
	
	@Override
	public void onClick(View v) {
		if (v.getId() == R.id.button1) {
			String msg1 = msgTextField1.getText().toString();
			String msg2 = msgTextField2.getText().toString();
			PostMessage p = new PostMessage();
			p.execute(msg1, msg2);
			Toast.makeText(this, "SUCCESSFULLY SENT", Toast.LENGTH_LONG).show();
		}
	}
}
