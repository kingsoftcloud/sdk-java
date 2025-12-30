package ksyun.client.influxdb.createinstance.v20191010;

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
        @JsonProperty("InstanceName")
        private String InstanceName;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("OrderId")
        private String OrderId;

        /***/
        @JsonProperty("SubOrderIds")
        private List<String> SubOrderIds;

    }

}
