package utils;

import aquality.appium.mobile.application.AqualityServices;

public class LogUtils {
        public static void infoLog(String textLog){
            AqualityServices.getLogger().info(textLog);
        }
}
