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

	private static ArrayList<Category> currentCategories;
	private static ArrayList<Category> allCategories = new ArrayList<Category>();

	//Collect all available categories, see if things are sorted, etc.
	public static void initiateCategories() {
		Log.d(TAG, "Initiating categories");
		
		allCategories.add(new Category(this, "Internet", R.drawable.webcat_img));
		allCategories.add(new Category(this, "Media", R.drawable.mediacat_img));
		allCategories.add(new Category(this, "Communication", R.drawable.socialcat_img));
		allCategories.add(new Category(this, "Games", R.drawable.gamescat_img));
		allCategories.add(new Category(this, "Productivity", R.drawable.prodcat_img));
		allCategories.add(new Category(this, "Root", R.drawable.rootcat_img));
		allCategories.add(new Category(this, "Tools", R.drawable.toolscat_img));
		allCategories.add(new Category(this, "Other", R.drawable.othercat_img));

		//For right now, currentCategories = allCategories --> will be changed
		currentCategories = allCategories;
	}	
	
	//Re-evaluate what categories are current
	public static void refreshCategories() {

	}

	//Returns the list of categories being used (have stuff in them)
	public static ArrayList<Category> getCurrentCategories() {
		return currentCategories;
	}
	
	//Returns the list of all existing categories
	public static ArrayList<Category> getAllCategories() {
		return allCategories;
	}
}
