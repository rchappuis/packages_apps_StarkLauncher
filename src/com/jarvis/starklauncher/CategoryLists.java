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
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;

import com.jarvis.starklauncher.R;

public class CategoryLists {
	private static final String TAG = "CategoryLists";	

	private static Category[] currentCategories;
	private static Category[] allCategories = new Integer[8];

	//Collect all available categories, see if things are sorted, etc.
	public static boolean initiateCategories() {
		Log.d(TAG, "Initiating categories");
		
		allCategories[0] = new Category(this, "Internet", R.drawable.webcat_img);
		allCategories[1] = new Category(this, "Media", R.drawable.mediacat_img);
		allCategories[2] = new Category(this, "Communication", R.drawable.socialcat_img);
		allCategories[3] = new Category(this, "Games", R.drawable.gamescat_img);
		allCategories[4] = new Category(this, "Productivity", R.drawable.prodcat_img);
		allCategories[5] = new Category(this, "Root", R.drawable.rootcat_img);
		allCategories[6] = new Category(this, "Tools", R.drawable.toolscat_img);
		allCategories[7] = new Category(this, "Other", R.drawable.othercat_img);

		//For right now, currentCategories = allCategories --> will be changed
		currentCategories = allCategories;

		return true;
	}	
	
	//Re-evaluate what categories are current
	public static boolean refreshCategories() {
		return true;
	}

	//Returns the list of categories being used (have stuff in them)
	public static Category[] getCurrentCategories() {
		return currentCategories;
	}
	
	//Returns the list of all existing categories
	public static Category[] getAllCategories() {
		return allCategories;
	}

	public static 
