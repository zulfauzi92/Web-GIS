package com.example.giskosandroid.base;

import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.giskosandroid.R;

public abstract class BaseFragmentHolderActivity extends BaseActivity {
    protected TextView tvToolbarTitle;
    protected FrameLayout flFragmentContainer;
    protected RelativeLayout rlActivityFragmentHolder;
    protected Button btBack;

    @Override
    protected void initializeFragment() { }

    @Override
    protected void initializeView() {
        setContentView(R.layout.activity_base);
        tvToolbarTitle = (TextView) findViewById(R.id.tvToolbarTitle);
        flFragmentContainer = (FrameLayout) findViewById(R.id.flFragmentContainer);
        rlActivityFragmentHolder = (RelativeLayout) findViewById(R.id.rlActivityFragmentHolder);
    }

    public void setTitle(String title) {
//        this.tvToolbarTitle.setText(title);
    }
}
