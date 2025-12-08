package ksyun.client.tidb.createinstance.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateInstanceResponse
* @Description CreateInstance 返回体
*/
@Data
@ToString
public class CreateInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**主订单ID*/
        @JsonProperty("OrderId")
        private String OrderId;

        /***/
        @JsonProperty("AccountId")
        private String AccountId;

        /***/
        @JsonProperty("Region")
        private String Region;

        /***/
        @JsonProperty("Az")
        private String Az;

    }

}
