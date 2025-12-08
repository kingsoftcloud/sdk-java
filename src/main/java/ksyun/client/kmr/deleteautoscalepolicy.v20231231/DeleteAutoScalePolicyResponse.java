package ksyun.client.kmr.deleteautoscalepolicy.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteAutoScalePolicyResponse
* @Description DeleteAutoScalePolicy 返回体
*/
@Data
@ToString
public class DeleteAutoScalePolicyResponse extends BaseResponseModel {
    /**HTTP状态码，200表示请求成功*/
    @JsonProperty("status")
    private Integer Status;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**返回码，0表示成功，其他值表示错误*/
        @JsonProperty("Code")
        private Integer Code;

        /**返回信息，通常用于描述错误信息*/
        @JsonProperty("Message")
        private String Message;

        /**请求ID，用于唯一标识一次请求*/
        @JsonProperty("RequestId")
        private String RequestId;

        /***/
        @JsonProperty("Data")
        private DataDto Data;

        @Data
        @ToString
        public static class DataDto {
            /**实例ID，用于唯一标识一个实例*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**策略ID*/
            @JsonProperty("PolicyId")
            private String PolicyId;

        }

    }

    /**返回信息，表示请求成功*/
    @JsonProperty("message")
    private String Message;

}
