package ksyun.client.kec.deletescalinggroup.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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