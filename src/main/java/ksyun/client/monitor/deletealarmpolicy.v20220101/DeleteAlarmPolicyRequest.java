package ksyun.client.monitor.deletealarmpolicy.v20220101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAlarmPolicyRequest
* @Description 请求参数
*/
@Data
public class DeleteAlarmPolicyRequest{
    /**告警策略ID。

> **说明：** 支持同时删除多个策略。*/
    @KsYunField(name="PolicyIds",type=2)
    private List<Integer> PolicyIdsList;

}
