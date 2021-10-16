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