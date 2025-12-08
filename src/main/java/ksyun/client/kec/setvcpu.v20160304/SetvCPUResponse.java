package ksyun.client.kec.setvcpu.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname SetvCPUResponse
* @Description SetvCPU 返回体
*/
@Data
@ToString
public class SetvCPUResponse extends BaseResponseModel {
    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("DedicatedHostId")
        private String DedicatedHostId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

        /***/
        @JsonProperty("Message")
        private String Message;

    }

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

}
