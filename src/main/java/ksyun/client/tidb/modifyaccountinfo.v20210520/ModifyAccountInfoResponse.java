package ksyun.client.tidb.modifyaccountinfo.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyAccountInfoResponse
* @Description ModifyAccountInfo 返回体
*/
@Data
@ToString
public class ModifyAccountInfoResponse extends BaseResponseModel {
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

        /***/
        @JsonProperty("OperStatus")
        private String OperStatus;

        /***/
        @JsonProperty("Msg")
        private String Msg;

    }

}
