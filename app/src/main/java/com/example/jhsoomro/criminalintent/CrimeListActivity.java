package com.example.jhsoomro.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by jhsoomro on 10/9/16.
 */

public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
