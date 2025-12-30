package ksyun.client.kce2.deletenode.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteNodeResponse
* @Description DeleteNode 返回体
*/
@Data
@ToString
public class DeleteNodeResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceSet")
        private List<DataInstanceSetDto> InstanceSet;

        @Data
        @ToString
        public static class DataInstanceSetDto {
            /***/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /***/
            @JsonProperty("KceNodeId")
            private String KceNodeId;

        }

    }

}
