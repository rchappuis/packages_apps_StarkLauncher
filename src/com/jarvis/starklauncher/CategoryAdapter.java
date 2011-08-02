package com.jarvis.starklauncher2;

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

import com.jarvis.starklauncher.R;

public class CategoryAdapter extends ArrayAdapter<Category> {
	private static final String TAG = "CategoryAdapter";

	private final LayoutInflater mInflater;

	public CategoryAdapter(Context context, ArrayList<Category> categories) {
		super(context, 0, categories);
		mInflater = LayoutInflater.from(context);
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		Category category = getItem(position);
		category = (Category) convertView;

		return category;
	}
}
