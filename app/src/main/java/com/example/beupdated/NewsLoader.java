package com.example.beupdated;

import android.content.Context;

import androidx.loader.content.AsyncTaskLoader;

import com.example.beupdated.utils.QueryUtils;

import java.util.List;

public class NewsLoader extends AsyncTaskLoader<List<News>> {

    private static final String LOG_TAG = "NEWSAPP";
    private String url;

    public NewsLoader(Context context, String url) {
        super(context);
        this.url = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<News> loadInBackground() {
        if (url == null) {
            return null;
        }
        List<News> data = QueryUtils.fetchNewsData(url);
        return data;
    }
}
