package com.example.nav.navmap;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by nav on 3/9/16.
 */
public interface NetworkServicesInterface {
    /**
     * Returns the result of async network call.
     * @param string
     */
    public void onResult(String string);
}
