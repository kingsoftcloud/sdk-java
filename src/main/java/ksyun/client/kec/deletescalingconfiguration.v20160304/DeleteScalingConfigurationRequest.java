package ksyun.client.kec.deletescalingconfiguration.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DeleteScalingConfigurationRequest
 * @Description 请求参数
 */
@Data
public class DeleteScalingConfigurationRequest {
    /**
     * 待删除的启动配置ID
     */
    @KsYunField(name = "ScalingConfigurationId")
    private List<String> ScalingConfigurationIdList;

}