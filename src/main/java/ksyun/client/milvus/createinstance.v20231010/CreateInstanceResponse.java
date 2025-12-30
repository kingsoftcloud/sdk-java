package ksyun.client.milvus.createinstance.v20231010;

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
        /**实例ID(此处不返回)*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例套餐(此处不返回)*/
        @JsonProperty("InstanceType")
        private String InstanceType;

        /**实例订单ID*/
        @JsonProperty("OrderId")
        private String OrderId;

        /**用户ID(此处不返回)*/
        @JsonProperty("AccountId")
        private String AccountId;

        /**地域(此处不返回)*/
        @JsonProperty("Region")
        private String Region;

        /**可用区(此处不返回)*/
        @JsonProperty("Az")
        private String Az;

    }

}
