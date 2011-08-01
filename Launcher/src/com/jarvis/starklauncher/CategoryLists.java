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

public class CategoryLists {
	private String TAG = "CategoryLists";	

	private static Integer[] currentCategories;
	private static Integer[] allCategories;

	//Collect all available categories, see if things are sorted, etc.
	public static boolean initiateCategories() {
		return true;
	}	
	
	//Re-evaluate what categories are current
	public static boolean refreshCategories() {
		return true;
	}

	//Returns the list of categories being used (have stuff in them)
	public static Integer[] getCurrentCategories() {
		return currentCategories;
	}
	
	//Returns the list of all existing categories
	public static Integer[] getAllCategories() {
		return allCategories;
	}
