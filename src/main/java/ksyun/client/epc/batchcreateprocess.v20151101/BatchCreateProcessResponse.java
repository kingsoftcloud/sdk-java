package ksyun.client.epc.batchcreateprocess.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchCreateProcessResponse
* @Description BatchCreateProcess 返回体
*/
@Data
@ToString
public class BatchCreateProcessResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ProcessInfo")
    private List<ProcessInfoDto> ProcessInfo;

    @Data
    @ToString
    public static class ProcessInfoDto {
        /***/
        @JsonProperty("ProcessId")
        private String ProcessId;

        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Sn")
        private String Sn;

    }

    /***/
    @JsonProperty("Return")
    private Boolean ReturnField;

}
