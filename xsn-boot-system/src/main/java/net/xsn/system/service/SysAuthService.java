package net.xsn.system.service;

import net.xsn.system.vo.AccessTokenVO;
import net.xsn.system.vo.SysAccountLoginVO;
import net.xsn.system.vo.SysMobileLoginVO;
import net.xsn.system.vo.SysUserTokenVO;

/**
 * 权限认证服务
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
public interface SysAuthService {

    /**
     * 账号密码登录
     *
     * @param login 登录信息
     */
    SysUserTokenVO loginByAccount(SysAccountLoginVO login);

    /**
     * 手机短信登录
     *
     * @param login 登录信息
     */
    SysUserTokenVO loginByMobile(SysMobileLoginVO login);

    /**
     * 发送手机验证码
     *
     * @param mobile 手机号
     */
    boolean sendCode(String mobile);

    /**
     * 根据刷新Token，获取AccessToken
     *
     * @param refreshToken refreshToken
     */
    AccessTokenVO getAccessToken(String refreshToken);

    /**
     * 退出登录
     *
     * @param accessToken accessToken
     */
    void logout(String accessToken);
}
