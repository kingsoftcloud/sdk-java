package ksyun.client.kce2.addepcnodes.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddEpcNodesResponse
* @Description AddEpcNodes 返回体
*/
@Data
@ToString
public class AddEpcNodesResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("InstanceSet")
        private List<InstanceSetDto> InstanceSet;

        @Data
        @ToString
        public static class InstanceSetDto {
            /***/
            @JsonProperty("KceNodeId")
            private String KceNodeId;

            /***/
            @JsonProperty("Code")
            private Integer Code;

        }

    }

}
