package net.xsn.framework.mybatis.interceptor;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 数据范围
 *
 * @author zzq ziqiangytu@gmail.com
 */
@Data
@AllArgsConstructor
public class DataScope {
    private String sqlFilter;

}