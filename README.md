# Native code for mobile application (Java or ObjectiveC) to hybride cordova

A Cordova plugin bridges a bit of functionality between the WebView powering a Cordova application and the native platform the Cordova application is running on. Plugins are composed of a single JavaScript interface used across all platforms, and native implementations following platform-specific Plugin interfaces that the JavaScript calls into. All of the core Cordova APIs are implemented using this architecture.

## 1) Demo

## 1) Environment Setup

## 2) Installing
    
#### - *HybrideApp* 
    
    - clone project HybrideApp
    - run npm i
    - run cordova platform add android / ios
    
    + Fro test on real device run : cordova run android / ios
    

#### - *NativeApp* 
    - clone project NativeApp
    - Open with AndroidStudio
    - Run app

## 3) Usage

Colons can be used to align columns.

| Native Code =>                                       | Hybride Cordova                     |
| -----------------------------------------------------|:-----------------------------------:|
| Files xml, Swift-UI, ... **=>**                      | Html5 + Css                         |
| Files java, kotlin, ObjectC, ... **=>**              | Controller JavaScript               |
| New instance Object **=>**                           | ProviderPlugin + cordova.exec       |


-   _Files xml or Swift-UI_ **to** _Html5 + Css_: A layout defines the structure for a user interface in your app, 
such as in an application native with Android or iOS, usually we used files xml or Swift-UI, but with cordova 
we should use a files html and css

-   _Files java, kotlin, ObjectiveC_ **to** _Controller JavaScript_: 
In native code, we used many of classes to intercept the events or 
to collect data from a user's interaction with the application, in hybride code, 
we need to use a files javascript for bind events (controller javascript)

-   New Instance: With native code, we write new Object for instance any class, but with cordova,
we need to passed by ProviderPlugin and a function javascript cordova.exec

-   ProviderPlugin: is a class java for Android (ProviderPlugin.java) or an implementation for iOS (ProviderPlugin.mm) 
like intermediate interface between project cordova and the native side. 
This class should be extend from CordovaPlugin and all business logic inside override method 'execute()'

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
    
-   cordova.exec: is a function like the entry point for any plugin from the project
    
        cordova.exec(function(winParam) {}, function(error) {}, "service",
                         "action", ["firstArgument", "secondArgument", 42,
                         false]);
                         
                         
        * function(winParam) {}: Success function callback. Assuming your exec call completes successfully, this function is invoked (optionally with any parameters you pass back to it).
        
        * function(error) {}: Error function callback. If the operation does not complete successfully, this function is invoked (optionally with an error parameter).
        
        * "service": The service name to call into on the native side. This is mapped to a native class, about which more information is available in the native guides listed below.
        
        * "action": The action name to call into. This is picked up by the native class receiving the exec call, and, depending on the platform, essentially maps to a class's method. The native guides listed below provide details.
        
        * [/* arguments */]: Arguments to pass into the native environment.


## 4) License
[MIT](https://choosealicense.com/licenses/mit/)


## 5) Author    
*Taki Eddine Rahal*     
*Software Engineer* 
 
**Mobile**: +21624158860    
**E-mail**: [takieddinerahal@gmail.com](mailto:takieddinerahal@gmail.com)      
**Skype**: takieddinerahal      
**Twitter**: TakiRahal    
**LinkedIn**: [https://www.linkedin.com/in/rahal-taki-eddine-51952ba4/](https://www.linkedin.com/in/rahal-taki-eddine-51952ba4/)    
**My Youtub channel:**  https://www.youtube.com/channel/UCdGytgjCyMv2QqQrjuWiDJg