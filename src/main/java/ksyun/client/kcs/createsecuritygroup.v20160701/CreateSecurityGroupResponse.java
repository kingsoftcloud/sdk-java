package ksyun.client.kcs.createsecuritygroup.v20160701;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateSecurityGroupResponse
* @Description CreateSecurityGroup 返回体
*/
@Data
@ToString
public class CreateSecurityGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("securityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("name")
        private String Name;

        /***/
        @JsonProperty("description")
        private String Description;

        /***/
        @JsonProperty("resourceNum")
        private Integer ResourceNum;

        /***/
        @JsonProperty("created")
        private String Created;

        /***/
        @JsonProperty("updated")
        private String Updated;

    }

}
