package com.mobiquiz.font;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

import com.mobiquiz.font.FontUtil;

public class RobotoThinItalicTextView extends TextView {
	
	private Context c;
    public RobotoThinItalicTextView(Context c) {
        super(c);
        this.c = c;
        setTypeface(FontUtil.getRobotoThinItalic(c));

    }
    public RobotoThinItalicTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.c = context;
        setTypeface(FontUtil.getRobotoThinItalic(c));
    }

    public RobotoThinItalicTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.c = context;
        setTypeface(FontUtil.getRobotoThinItalic(c));
    }

}
