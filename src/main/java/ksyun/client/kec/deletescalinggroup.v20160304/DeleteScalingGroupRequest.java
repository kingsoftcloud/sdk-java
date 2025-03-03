package ksyun.client.kec.deletescalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteScalingGroupRequest
 * @Description 请求参数
 */
@Data
public class DeleteScalingGroupRequest {
    /**
     *
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

}