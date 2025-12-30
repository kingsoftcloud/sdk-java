package ksyun.client.kmr.modifyhosts.v20231231;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyHostsResponse
* @Description ModifyHosts 返回体
*/
@Data
@ToString
public class ModifyHostsResponse extends BaseResponseModel {

    /**状态*/
    @JsonProperty("status")
    private Integer Status;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**Code*/
        @JsonProperty("Code")
        private Integer Code;

        /**信息*/
        @JsonProperty("Message")
        private String Message;

        /**请求ID*/
        @JsonProperty("RequestId")
        private String RequestId;

        /**Data*/
        @JsonProperty("Data")
        private DataDataDto Data;

        @Data
        @ToString
        public static class DataDataDto {
        }

    }

}
