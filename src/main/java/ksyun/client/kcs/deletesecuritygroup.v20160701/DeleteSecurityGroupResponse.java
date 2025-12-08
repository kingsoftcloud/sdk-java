package ksyun.client.kcs.deletesecuritygroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DeleteSecurityGroupResponse
* @Description DeleteSecurityGroup 返回体
*/
@Data
@ToString
public class DeleteSecurityGroupResponse extends BaseResponseModel {
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
        @JsonProperty("securityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("message")
        private String Message;

    }

}
