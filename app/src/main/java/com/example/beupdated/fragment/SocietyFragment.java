package com.example.beupdated.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.loader.content.Loader;

import com.example.beupdated.News;
import com.example.beupdated.NewsLoader;
import com.example.beupdated.NewsPreferences;
import com.example.beupdated.R;

import java.util.List;

public class SocietyFragment extends BaseArticlesFragment {

    @NonNull
    @Override
    public Loader<List<News>> onCreateLoader(int i, Bundle bundle) {
        String societyUrl = NewsPreferences.getPreferredUrl(getContext(), getString(R.string.society));
        return new NewsLoader(getActivity(), societyUrl);
    }
}
