package com.github.jrejaud.viewpagerindicatorg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class PageFragment extends Fragment {
    private static final String BUNDLE_PAGE_NUMBER = "BUNDLE_PAGE_NUMBER";

    public static PageFragment newInstance(int pageNumber) {
        Bundle bundle = new Bundle();
        bundle.putInt(BUNDLE_PAGE_NUMBER, pageNumber);

        PageFragment fragment = new PageFragment();
        fragment.setArguments(bundle);

        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_page, container, false);

        if (rootView != null) {
            int pageNumber = getArguments().getInt(BUNDLE_PAGE_NUMBER);

            TextView pageTextView = (TextView) rootView.findViewById(R.id.text_page);
            pageTextView.setText(String.valueOf(pageNumber));
        }

        return rootView;
    }
}
