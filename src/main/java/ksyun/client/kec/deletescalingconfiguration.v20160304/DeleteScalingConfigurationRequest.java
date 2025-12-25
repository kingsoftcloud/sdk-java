package ksyun.client.kec.deletescalingconfiguration.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteScalingConfigurationRequest
* @Description 请求参数
*/
@Data
public class DeleteScalingConfigurationRequest{
    /**待删除的启动配置ID 
 */
    @KsYunField(name = "ScalingConfigurationId", type = 1)
    private List<String> ScalingConfigurationIdList;

}
