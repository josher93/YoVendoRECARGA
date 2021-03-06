package com.globalpaysolutions.yovendorecarga.customs;

/**
 * Created by Geovanni on 02/04/2016.
 */
public final class StringsURL
{
    //Servidor para PRODUCCION
    //public final static String URL_BASE = "http://csncusgats.cloudapp.net:82/v1/";

    //PRE-PRODUCCIÓN (Enviando recargas de prueba)
    public final static String URL_BASE = "http://csncusgats.cloudapp.net:8074/v1/";

    //Servidor para DESARROLLOm
    //public final static String URL_BASE = "http://csncusgats.cloudapp.net:8073/v1/";

    //  :::::   LOCALHOST API   :::::
    //public final static String URL_BASE = "http://10.0.2.2:49435/";

    //:::::   LOCALHOST API   :::::
    //public final static String URL_BASE = "http://192.168.1.32:8084/";

    public final static String SIGNIN = URL_BASE + "signin/";

    public final static String AUTH_SIGNIN = URL_BASE + "auth/signin/";

    public final static String TOPUP = URL_BASE + "topup/";

    public final static String PASSWORD = URL_BASE + "password";

    public final static String HISTORY_GMT0 = URL_BASE + "history/gmt0";

    public final static String HISTORY = URL_BASE + "history";

    public final static String PROFILE = URL_BASE + "profile";

    public final static String DEPOSIT = URL_BASE + "deposito";

    public final static String TOPUPPAYMENT = URL_BASE + "topuppayment";

    public final static String SIGNOUT = URL_BASE + "signout";

    public final static String USERBAG = URL_BASE + "userbag";

    public final static String PRODUCTS = URL_BASE + "products/";

    public final static String DEVICEREGISTRATION = URL_BASE + "deviceregistration/";

    public final static String NOTIFICATIONSHISTORY = URL_BASE + "getnotifications/";

    public final static String BALANCREQUEST = URL_BASE + "balancerequest";

    public final static String BANKS = URL_BASE + "banks/";

    public final static String OPERATORS = URL_BASE + "operators/";

    public final static String USER_NOTIFICATIONS = URL_BASE + "getUserNotifications/";


    /**
     *
     *
     *  CEOAnalytics API
     *
     **/

    //Desarrollo
    //public final static String CEO_ANALYTICS_URL_BASE = "http://csncusgats.cloudapp.net:8076/v1/";

    //Pre-Produccion
    public final static String CEO_ANALYTICS_URL_BASE = "http://csncusgats.cloudapp.net:8077/v1/";

    public static String CEO_ANALYTICS_APIKEY = "a1bXuav8tqtXQWPALOhdQJvAQ1IK8esE4d6YYGBk+qc=";

    public final static String CEOA_NOTIFICATIONS_HISTORY = CEO_ANALYTICS_URL_BASE + "notificationshistory/android";

    public final static String CEOA_DEVICE_DATA = CEO_ANALYTICS_URL_BASE + "api/devicedata";


    public final static String CEO_MARK_NOTIFICATION_READ = CEO_ANALYTICS_URL_BASE + "setNotificationRead/";




    /**
     *
     *  URL PARA PROBAR HTTP STATUS CODES
     *
     *  GET /status
     *  http://apps.testinsane.com/rte/status/{code}/{delay}
     *
     *  POST /status
     *  http://apps.testinsane.com/rte/status/{code}/{delay}
     *
     * */

    public final static String TEST_TIMEOUT = "http://apps.testinsane.com/rte/status/200/25";
    public final static String TEST_INVALID_TOKEN = "http://apps.testinsane.com/rte/status/505/3";
    public final static String TEST_SERVER_ERROR = "http://apps.testinsane.com/rte/status/404/3";
    public final static String TEST_INVALID_CREDENTIALS = "http://apps.testinsane.com/rte/status/403/3";
    public final static String TEST_INSUFFICENT_BALANCE = "http://apps.testinsane.com/rte/status/503/3";

    public final static String TEST_TOPUP_INVALID_TOKEN = "http://apps.testinsane.com/rte/status/502/3";
    public final static String TEST_TOPUP_INSUFFICENT_BALANCE = "http://apps.testinsane.com/rte/status/503/3";
    public final static String TEST_TOPUP_GENERAL_ERROR = "http://apps.testinsane.com/rte/status/505/3";
    public final static String TEST_TOPUP_GATS_ERROR = "http://apps.testinsane.com/rte/status/403/3";
}
