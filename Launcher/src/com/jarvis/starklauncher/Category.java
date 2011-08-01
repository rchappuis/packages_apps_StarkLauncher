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

public class Category extends ImageButton {
	private String TAG = "Category";

	private String mLabel;
	private int mImgResource;

	public Category (Context context, String iLabel, int iImgResource) {
		super(context);
		mLabel = iLabel;
		mImgResource = iImgResource;
	}

	
