package ksyun.client.dts.describesourceuserconfig.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSourceUserConfigResponse
* @Description DescribeSourceUserConfig 返回体
*/
@Data
@ToString
public class DescribeSourceUserConfigResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("SourceUserConfig")
        private List<String> SourceUserConfig;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
