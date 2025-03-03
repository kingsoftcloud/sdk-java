package ksyun.client.monitor.deletealarmpolicy.v20220101;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteAlarmPolicyRequest
 * @Description 请求参数
 */
@Data
public class DeleteAlarmPolicyRequest {
    /**
     * 告警策略ID。
     * <p>
     * > **说明：** 支持同时删除多个策略。
     */
    @KsYunField(name = "PolicyIds", type = 2)
    private List<Integer> PolicyIdsList;

}