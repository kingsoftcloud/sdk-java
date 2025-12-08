package ksyun.client.clickhouse.createsecuritygroup.v20210101;

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
        /***/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /***/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /***/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /***/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /***/
        @JsonProperty("Rules")
        private List<String> Rules;

        /***/
        @JsonProperty("Instances")
        private List<String> Instances;

    }

}
