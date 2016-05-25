package io.github.javiewer.view;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import android.util.AttributeSet;
import android.widget.ImageView;

import io.github.javiewer.R;

/**
 * Project: JAViewer
 */
public class ScreenshotImageView extends ImageView {

    public ScreenshotImageView(Context context) {
        super(context);
    }

    public ScreenshotImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ScreenshotImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        try {
            int measuredWidth = MeasureSpec.getSize(widthMeasureSpec);

            setMeasuredDimension(measuredWidth, (int) ((double) measuredWidth / 12 * 9));

            /*if (getDrawable() != null) {
                setBackgroundColor(ResourcesCompat.getColor(getResources(), R.color.colorPrimary, null));
            }*/

        } catch (Exception e) {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

}