package ksyun.client.ter.describestackoutputs.v20240415;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeStackOutputsResponse
* @Description DescribeStackOutputs 返回体
*/
@Data
@ToString
public class DescribeStackOutputsResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Outputs")
    private List<OutputsDto> Outputs;

    @Data
    @ToString
    public static class OutputsDto {
        /***/
        @JsonProperty("Name")
        private String Name;

        /***/
        @JsonProperty("Type")
        private String Type;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("Value")
        private String Value;

        /***/
        @JsonProperty("Params")
        private String Params;

    }

}
