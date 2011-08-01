package com.android.launcher2;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;

import java.util.ArrayList;
import java.util.Collections;

import com.android.launcher.R;

public class CategoryAdapter extends BaseAdapter {
	private String TAG = "CategoryAdapter";

	private Context mContext;

	public CategoryAdapter(Context c) {
		mContext = c;
	}

	public int getCount() {
		return mThumbIds.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		Category category;
		if (convertView == null) {  // if it's not recycled, initialize some attributes
		    category = new ImageView(mContext);
		    category.setLayoutParams(new GridView.LayoutParams(85, 85));
		    category.setScaleType(ImageView.ScaleType.CENTER_CROP);
		    category.setPadding(80, 80, 80, 80);
		} else {
		    category = (Category) convertView;
		}

		category.setImageResource(mThumbIds[position]);
		return category;
	}

	private Integer[] mThumbIds = CategoryLists.getCurrentCategories();
}
