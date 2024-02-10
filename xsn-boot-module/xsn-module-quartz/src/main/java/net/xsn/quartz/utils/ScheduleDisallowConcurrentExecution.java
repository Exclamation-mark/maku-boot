package net.xsn.quartz.utils;

import org.quartz.DisallowConcurrentExecution;

/**
 * 禁止并发
 *
 * @author 阿沐 babamu@126.com
 * <a href="https://xsn.net">xsn</a>
 *
 */
@DisallowConcurrentExecution
public class ScheduleDisallowConcurrentExecution extends AbstractScheduleJob {

}
