package ksyun.client.kcs.restorebytimepointswitch.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RestoreByTimePointSwitchRequest
 * @Description 请求参数
 */
@Data
public class RestoreByTimePointSwitchRequest {
    /**
     * 实例Id。
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 开启或关闭基于时间点恢复。可选值：on，off
     */
    @KsYunField(name = "RestoreSwitch")
    private String RestoreSwitch;

}