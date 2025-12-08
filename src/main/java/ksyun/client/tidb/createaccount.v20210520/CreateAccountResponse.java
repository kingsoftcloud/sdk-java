package ksyun.client.tidb.createaccount.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateAccountResponse
* @Description CreateAccount 返回体
*/
@Data
@ToString
public class CreateAccountResponse extends BaseResponseModel {
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
        /**实例id*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**此次操作结果*/
        @JsonProperty("OperStatus")
        private String OperStatus;

        /**操作信息*/
        @JsonProperty("Msg")
        private String Msg;

    }

}
