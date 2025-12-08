package ksyun.client.kcs.deallocatesecuritygroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeallocateSecurityGroupResponse
* @Description DeallocateSecurityGroup 返回体
*/
@Data
@ToString
public class DeallocateSecurityGroupResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("cacheId")
        private String CacheId;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("message")
        private String Message;

    }

}
