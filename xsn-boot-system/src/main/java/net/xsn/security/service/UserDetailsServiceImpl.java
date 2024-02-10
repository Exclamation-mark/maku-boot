package net.xsn.security.service;

import lombok.AllArgsConstructor;
import net.xsn.system.convert.SysUserConvert;
import net.xsn.system.dao.SysUserDao;
import net.xsn.system.entity.SysUserEntity;
import net.xsn.system.service.SysUserDetailsService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 账号登录 UserDetailsService
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 */
@Service
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
    private final SysUserDetailsService sysUserDetailsService;
    private final SysUserDao sysUserDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        SysUserEntity userEntity = sysUserDao.getByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("用户名或密码错误");
        }

        return sysUserDetailsService.getUserDetails(SysUserConvert.INSTANCE.convertDetail(userEntity));
    }

}
