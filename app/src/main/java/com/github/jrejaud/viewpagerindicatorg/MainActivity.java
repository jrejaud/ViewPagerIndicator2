package com.github.jrejaud.viewpagerindicatorg;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.github.jrejaud.viewpagerindicator2.PageIndicator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = (ViewPager) findViewById(R.id.view_pager);
        viewPager.setAdapter(new InternalPagerAdapter(getSupportFragmentManager()));

        PageIndicator pageIndicator = (PageIndicator) findViewById(R.id.page_indicator);
        pageIndicator.setViewPager(viewPager);

    }

    private static class InternalPagerAdapter extends FragmentStatePagerAdapter {
        private static final int PAGE_COUNT = 5;

        public InternalPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return PageFragment.newInstance(position);
        }

        @Override
        public int getCount() {
            return PAGE_COUNT;
        }
    }
}
