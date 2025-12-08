package ksyun.client.kec.deletededicatedhost.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteDedicatedHostResponse
* @Description DeleteDedicatedHost 返回体
*/
@Data
@ToString
public class DeleteDedicatedHostResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("ReturnSet")
    private ReturnSetDto ReturnSet;

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

}
