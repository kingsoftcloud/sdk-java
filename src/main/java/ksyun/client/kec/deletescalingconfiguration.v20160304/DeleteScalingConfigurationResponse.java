package ksyun.client.kec.deletescalingconfiguration.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteScalingConfigurationResponse
* @Description DeleteScalingConfiguration 返回体
*/
@Data
@ToString
public class DeleteScalingConfigurationResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("ScalingConfigurationId")
        private String ScalingConfigurationId;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

}
