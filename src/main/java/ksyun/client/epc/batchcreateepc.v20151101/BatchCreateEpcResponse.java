package ksyun.client.epc.batchcreateepc.v20151101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname BatchCreateEpcResponse
* @Description BatchCreateEpc 返回体
*/
@Data
@ToString
public class BatchCreateEpcResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Host")
    private List<HostDto> Host;

    @Data
    @ToString
    public static class HostDto {
        /***/
        @JsonProperty("HostId")
        private String HostId;

        /***/
        @JsonProperty("HostName")
        private String HostName;

    }

}
