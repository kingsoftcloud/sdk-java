package ksyun.client.dts.connectivitycheck.v20180108;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ConnectivityCheckResponse
* @Description ConnectivityCheck 返回体
*/
@Data
@ToString
public class ConnectivityCheckResponse extends BaseResponseModel {
    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("Status")
        private String Status;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
