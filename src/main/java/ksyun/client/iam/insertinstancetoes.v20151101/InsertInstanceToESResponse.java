package ksyun.client.iam.insertinstancetoes.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname InsertInstanceToESResponse
* @Description InsertInstanceToES 返回体
*/
@Data
@ToString
public class InsertInstanceToESResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("instanceId")
        private String InstanceId;

        /***/
        @JsonProperty("status")
        private Integer Status;

        /***/
        @JsonProperty("result")
        private String Result;

        /***/
        @JsonProperty("reason")
        private String Reason;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
