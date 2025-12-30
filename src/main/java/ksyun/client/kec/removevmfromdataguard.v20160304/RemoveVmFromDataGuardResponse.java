package ksyun.client.kec.removevmfromdataguard.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname RemoveVmFromDataGuardResponse
* @Description RemoveVmFromDataGuard 返回体
*/
@Data
@ToString
public class RemoveVmFromDataGuardResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private List<ReturnSetDto> ReturnSet;

    @Data
    @ToString
    public static class ReturnSetDto {
        /***/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /***/
        @JsonProperty("Return")
        private Boolean ReturnField;

    }

}
