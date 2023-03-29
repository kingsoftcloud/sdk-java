package ksyun.client.kec.detachinstance.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DetachInstanceRequest
* @Description 请求参数
*/
@Data
public class DetachInstanceRequest{
    /**伸缩组ID 
 */
    @KsYunField(name="ScalingGroupId")
    private String ScalingGroupId;

    /**待从伸缩组中移除的云服务器ID 
 */
    @KsYunField(name="ScalingInstanceId")
    private List<String> ScalingInstanceIdList;


}