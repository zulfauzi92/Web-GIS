package com.example.giskosandroid.modules.kosdetail;

import android.view.View;

import com.example.giskosandroid.R;
import com.example.giskosandroid.base.BaseFragmentHolderActivity;
import com.example.giskosandroid.utils.Constants;

public class KosDetailActivity extends BaseFragmentHolderActivity {
    KosDetailFragment kosDetailFragment;

    @Override
    protected void initializeFragment() {
        int id = getIntent().getExtras().getInt(Constants.EXTRA_KOS_ID);

        initializeView();

        setTitle(getString(R.string.kosdetaiil_title));

        kosDetailFragment = new KosDetailFragment();
        kosDetailFragment.setCurrentKosId(id);
        setCurrentFragment(kosDetailFragment, false);
    }
}
