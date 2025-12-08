package ksyun.client.dts.describedtsparameterconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeDTSParameterConfigResponse
* @Description DescribeDTSParameterConfig 返回体
*/
@Data
@ToString
public class DescribeDTSParameterConfigResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("DTSParameterConfig")
        private List<String> DTSParameterConfig;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
