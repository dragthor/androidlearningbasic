package com.kriskrause.basic;

import android.view.View;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.content.Context;

public class MainActivity extends Activity
{
    public final static String EXTRA_MESSAGE = "com.kriskrause.basic.MESSAGE";

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

   /** Called when the user clicks the Send button */
   public void sendMessage(View view) {

	Context context = getApplicationContext();

	Toast toast = Toast.makeText(context, "testing", Toast.LENGTH_SHORT);
	toast.show();

	Intent intent = new Intent(this, DisplayMessageActivity.class);
     	EditText editText = (EditText) findViewById(R.id.edit_message);

	String message = editText.getText().toString();
	intent.putExtra(EXTRA_MESSAGE, message);

	startActivity(intent);
   }
}
