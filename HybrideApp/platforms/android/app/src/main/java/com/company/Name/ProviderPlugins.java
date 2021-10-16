package com.company.Name;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;
import org.json.JSONArray;
import org.json.JSONException;

public class ProviderPlugins extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray arguments,
                           CallbackContext callbackContext) throws JSONException {

        if (action.equals("calculate")) {
            String responseText = "";
            try {

                Integer minNumber = arguments.getInt(0);
                Integer maxNumber = arguments.getInt(1);
                MainServices mainServices = new MainServices();
                responseText = mainServices.getPrimesNumber(minNumber, maxNumber);


                // responseText += ", " + arguments.getString(0);
                callbackContext.success(responseText);
                return true;
            } catch (JSONException e) {
                callbackContext.error(e.getMessage());
            }
        } else {
            callbackContext.error("Invalid action: " + action);
            return false;
        }
        return false;
    }
}
