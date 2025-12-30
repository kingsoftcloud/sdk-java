package ksyun.client.kec.createscalingconfiguration.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateScalingConfigurationResponse
* @Description CreateScalingConfiguration 返回体
*/
@Data
@ToString
public class CreateScalingConfigurationResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**启动配置ID*/
    @JsonProperty("ScalingConfigurationId")
    private String ScalingConfigurationId;

}
