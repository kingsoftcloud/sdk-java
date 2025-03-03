package ksyun.client.kcs.analyzedailyswitch.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AnalyzeDailySwitchRequest
 * @Description 请求参数
 */
@Data
public class AnalyzeDailySwitchRequest {
    /**
     * 缓存服务ID	 实例ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 运行日志开关	 true表示开启，false表示关闭，null保持当前状态不变 默认传null
     */
    @KsYunField(name = "ServiceLog")
    private Boolean ServiceLog;

    /**
     * 慢日志开关	 true表示开启，false表示关闭，null保持当前状态不变 默认传null
     */
    @KsYunField(name = "SlowLog")
    private Boolean SlowLog;


}