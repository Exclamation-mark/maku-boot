package net.xsn.framework.common.cache;

/**
 * Redis Key管理
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public class RedisKeys {

    /**
     * 验证码Key
     */
    public static String getCaptchaKey(String key) {
        return "sys:captcha:" + key;
    }

    /**
     * accessToken Key
     */
    public static String getAccessTokenKey(String accessToken) {
        return "sys:token:" + accessToken;
    }

    public static String getLogKey() {
        return "sys:log";
    }

}
