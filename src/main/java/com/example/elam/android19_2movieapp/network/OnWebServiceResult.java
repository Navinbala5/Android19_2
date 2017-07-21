package com.example.elam.android19_2movieapp.network;

/**
 * Created by elam on 13-07-2017.
 */


import com.example.elam.android19_2movieapp.utils.CommonUtilities;


public interface OnWebServiceResult {
    public void getWebResponse(String result, CommonUtilities.SERVICE_TYPE type);
}