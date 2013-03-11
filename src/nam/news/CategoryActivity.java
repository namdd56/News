package nam.news;

import nam.adapter.CategoryAdapter;
import nam.utility.Variables;
import android.app.ListActivity;
import android.os.Bundle;

public class CategoryActivity extends ListActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle bundle = getIntent().getExtras();
		int paper = bundle.getInt(Variables.PA);
		setTitle(Variables.PAPER[paper]);
		CategoryAdapter adapter = new CategoryAdapter(this,
				Variables.ICONS[paper], Variables.categories[paper]);
		setListAdapter(adapter);

	}

}
