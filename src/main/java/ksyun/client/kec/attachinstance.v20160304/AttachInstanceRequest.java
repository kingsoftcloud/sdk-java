package ksyun.client.kec.attachinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname AttachInstanceRequest
 * @Description 请求参数
 */
@Data
public class AttachInstanceRequest {
    /**
     * 伸缩组ID
     */
    @KsYunField(name = "ScalingGroupId")
    private String ScalingGroupId;

    /**
     * 待添加的云服务器ID必须与伸缩组处于同一VPC和子网下
     */
    @KsYunField(name = "ScalingInstanceId")
    private List<String> ScalingInstanceIdList;


}