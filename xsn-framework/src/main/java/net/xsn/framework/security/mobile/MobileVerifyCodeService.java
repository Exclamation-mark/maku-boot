package net.xsn.framework.security.mobile;

/**
 * 手机短信登录，验证码效验
 *
 * @author zzq ziqiangytu@gmail.com
 */
public interface MobileVerifyCodeService {

    boolean verifyCode(String mobile, String code);
}
