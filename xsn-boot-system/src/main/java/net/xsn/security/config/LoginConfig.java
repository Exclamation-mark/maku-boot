package net.xsn.security.config;

import net.xsn.api.module.message.SmsApi;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

/**
 * 登录配置信息
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Configuration
public class LoginConfig {

    @Bean
    @ConditionalOnMissingBean
    SmsApi smsApi() {
        return new SmsApi() {
            @Override
            public boolean send(String mobile, Map<String, String> params) {
                return false;
            }

            @Override
            public boolean sendCode(String mobile, String key, String value) {
                return false;
            }

            @Override
            public boolean verifyCode(String mobile, String code) {
                return false;
            }
        };
    }
}
