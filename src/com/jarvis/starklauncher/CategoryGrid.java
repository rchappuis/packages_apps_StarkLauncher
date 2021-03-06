package com.jarvis.starklauncher;

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

public class CategoryGrid extends GridView {
	private static final String TAG = "CategoryGrid";

	private ArrayList<Category> categories;

	public CategoryGrid(Context context) {
		super(context);
		categories = CategoryLists.getCurrentCategories();
		setAdapter(new CategoryAdapter(context, categories);
	}


}
