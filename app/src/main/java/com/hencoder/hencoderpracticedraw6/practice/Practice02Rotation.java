package com.hencoder.hencoderpracticedraw6.practice;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.hencoder.hencoderpracticedraw6.R;

public class Practice02Rotation extends RelativeLayout {
    Button animateBt;
    ImageView imageView;

    public Practice02Rotation(Context context) {
        super(context);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice02Rotation(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    int type = 0;

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();

        animateBt = (Button) findViewById(R.id.animateBt);
        imageView = (ImageView) findViewById(R.id.imageView);

        animateBt.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(final View v) {
                // // TODO 在这里处理点击事件，通过 View.animate().rotation/X/Y() 来让 View 旋转

                switch (type) {
                    case 0:
                        imageView.animate()
                                .setDuration(500)
                                .rotationX(180);
                        break;
                    case 1:
                        imageView.animate()
                                .setDuration(500)
                                .rotationX(0);
                        break;
                    case 2:
                        imageView.animate()
                                .setDuration(500)
                                .rotationY(180);
                        break;
                    case 3:
                        imageView.animate()
                                .setDuration(500)
                                .rotationY(0);
                        break;
                    case 4:
                        imageView.animate()
                                .setDuration(500)
                                .rotation(180);
                        break;
                    case 5:
                        imageView.animate()
                                .setDuration(500)
                                .rotation(0);
                        break;
                }
                type = ++type % 6;

            }
        });
    }
}