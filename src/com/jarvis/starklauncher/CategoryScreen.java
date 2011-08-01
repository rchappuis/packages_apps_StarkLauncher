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

public class CategoryScreen extends RelativeLayout {
	private static final String TAG = "CategoryGrid";

	GridView categoryGrid = (GridView) findViewById(R.id.category_listing);
	grid.setAdapter(new CategoryAdapter(this));

	Dockbar dock = (Dockbar) findViewById(R.id.shortcut_dock);
	
}	
