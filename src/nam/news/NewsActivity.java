package nam.news;

import nam.adapter.PaperAdapter;
import nam.utility.Variables;
import android.os.Bundle;
import android.app.ListActivity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class NewsActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			//	android.R.layout.simple_list_item_1, Variables.PAPER);
		//ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
			//	R.layout.paper, R.id.dantri, Variables.PAPER);
		PaperAdapter adapter = new PaperAdapter(this, R.id.tvPaper, Variables.PAPER);
		setListAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.paper, menu);
		return true;
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		Intent intent = new Intent("nam.news.CATEGORY");
		intent.putExtra(Variables.PA, position);
		startActivity(intent);
	}
	

}
