package ksyun.client.kmr.deleteautoscalepolicy.v20231231;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteAutoScalePolicyRequest
* @Description 请求参数
*/
@Data
public class DeleteAutoScalePolicyRequest{
    /**实例ID，用于唯一标识一个实例*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**策略ID*/
    @KsYunField(name="PolicyId")
    private String PolicyId;

}