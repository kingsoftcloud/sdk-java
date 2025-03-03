package ksyun.client.kec.enablescalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname EnableScalingGroupRequest
 * @Description 请求参数
 */
@Data
public class EnableScalingGroupRequest {
    /**
     * 待启用的伸缩组ID
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

}