package ksyun.client.clickhouse.createinstance.v20210101;

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
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /***/
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
