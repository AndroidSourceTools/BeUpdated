package com.example.beupdated;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.preference.PreferenceManager;

import com.example.beupdated.utils.Constants;

import static com.example.beupdated.utils.Constants.API_KEY;
import static com.example.beupdated.utils.Constants.API_KEY_PARAM;
import static com.example.beupdated.utils.Constants.FORMAT;
import static com.example.beupdated.utils.Constants.FORMAT_PARAM;
import static com.example.beupdated.utils.Constants.FROM_DATE_PARAM;
import static com.example.beupdated.utils.Constants.ORDER_BY_PARAM;
import static com.example.beupdated.utils.Constants.ORDER_DATE_PARAM;
import static com.example.beupdated.utils.Constants.PAGE_SIZE_PARAM;
import static com.example.beupdated.utils.Constants.QUERY_PARAM;
import static com.example.beupdated.utils.Constants.SECTION_PARAM;
import static com.example.beupdated.utils.Constants.SHOW_FIELDS;
import static com.example.beupdated.utils.Constants.SHOW_FIELDS_PARAM;
import static com.example.beupdated.utils.Constants.SHOW_TAGS;
import static com.example.beupdated.utils.Constants.SHOW_TAGS_PARAM;

public final class NewsPreferences {

    public static Uri.Builder getPreferredUri(Context context) {
        SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String numOfItems = sharedPreferences.getString(
                context.getString(R.string.settings_number_of_items_key),
                context.getString(R.string.settings_number_of_items_default));

        String orderBy = sharedPreferences.getString(
                context.getString(R.string.settings_order_by_key),
                context.getString(R.string.settings_order_by_default));

        String orderDate = sharedPreferences.getString(
                context.getString(R.string.settings_order_date_key),
                context.getString(R.string.settings_order_date_default));

        String fromDate = sharedPreferences.getString(
                context.getString(R.string.settings_from_date_key),
                context.getString(R.string.settings_from_date_default));

        Uri uri = Uri.parse(Constants.NEWS_REQUEST_URL);

        Uri.Builder builder = uri.buildUpon();

        builder.appendQueryParameter(QUERY_PARAM, "");
        builder.appendQueryParameter(ORDER_BY_PARAM, orderBy);
        builder.appendQueryParameter(PAGE_SIZE_PARAM, numOfItems);
        builder.appendQueryParameter(ORDER_DATE_PARAM, orderDate);
        builder.appendQueryParameter(FROM_DATE_PARAM, fromDate);
        builder.appendQueryParameter(SHOW_FIELDS_PARAM, SHOW_FIELDS);
        builder.appendQueryParameter(FORMAT_PARAM, FORMAT);
        builder.appendQueryParameter(SHOW_TAGS_PARAM, SHOW_TAGS);
        builder.appendQueryParameter(API_KEY_PARAM, API_KEY);

        return builder;
    }

    public static String getPreferredUrl(Context context, String section) {
        Uri.Builder builder = getPreferredUri(context);
        return builder.appendQueryParameter(SECTION_PARAM, section).toString();
    }
}
