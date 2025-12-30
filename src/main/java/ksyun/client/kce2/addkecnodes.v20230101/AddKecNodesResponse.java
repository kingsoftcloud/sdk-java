package ksyun.client.kce2.addkecnodes.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AddKecNodesResponse
* @Description AddKecNodes 返回体
*/
@Data
@ToString
public class AddKecNodesResponse extends BaseResponseModel {

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
        private List<DataInstanceSetDto> InstanceSet;

        @Data
        @ToString
        public static class DataInstanceSetDto {
            /***/
            @JsonProperty("KceNodeId")
            private String KceNodeId;

            /***/
            @JsonProperty("Code")
            private Integer Code;

        }

    }

}
