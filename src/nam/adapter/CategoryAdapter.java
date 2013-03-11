package nam.adapter;

import nam.news.R;
import nam.utility.Variables;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryAdapter extends ArrayAdapter<String> {
	private Context context;
	private String[] category;
	private int ivIcon;

	public CategoryAdapter(Context context, int ivIcon, String[] category) {
		super(context, ivIcon, category);
		this.context = context;
		this.ivIcon = ivIcon;
		this.category = category;

	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View rowView = inflater.inflate(R.layout.category, parent, false);
		ImageView iv = (ImageView) rowView.findViewById(R.id.ivIcon);
		TextView tv = (TextView) rowView.findViewById(R.id.tvCategory);
		iv.setImageResource(ivIcon);
		tv.setText(category[position]);
		return rowView;
	}
	

}
