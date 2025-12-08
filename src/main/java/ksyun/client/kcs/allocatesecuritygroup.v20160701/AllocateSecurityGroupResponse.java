package ksyun.client.kcs.allocatesecuritygroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname AllocateSecurityGroupResponse
* @Description AllocateSecurityGroup 返回体
*/
@Data
@ToString
public class AllocateSecurityGroupResponse extends BaseResponseModel {
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
