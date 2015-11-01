package com.nullcognition.datastructuresproblemsolvingusingjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity{


	// The unsigned right shift operator ">>>" shifts a zero into the leftmost position,
	// while the leftmost position after ">>" depends on sign extension.

	@Override
	protected void onCreate(Bundle savedInstanceState){

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Bitshifting.bitshift(28); // overflow on << 3 and 4
//		Bitshifting.bitshift(2); // double 0 on 3rd and forth bitshift
//		Bitshifting.bitshift(4); // 1 to 16

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
		getMenuInflater().inflate(R.menu.menu_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item){
		int id = item.getItemId();

		if(id == R.id.action_settings){
			return true;
		}

		return super.onOptionsItemSelected(item);
	}
}
