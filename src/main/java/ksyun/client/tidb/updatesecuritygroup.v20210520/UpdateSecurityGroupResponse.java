package ksyun.client.tidb.updatesecuritygroup.v20210520;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname UpdateSecurityGroupResponse
* @Description UpdateSecurityGroup 返回体
*/
@Data
@ToString
public class UpdateSecurityGroupResponse extends BaseResponseModel {
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
        /**安全组ID*/
        @JsonProperty("SecurityGroupId")
        private String SecurityGroupId;

        /**安全组名称*/
        @JsonProperty("SecurityGroupName")
        private String SecurityGroupName;

        /**集群类型*/
        @JsonProperty("GroupType")
        private String GroupType;

        /**安全组类型*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**安全组描述*/
        @JsonProperty("Description")
        private String Description;

        /**关联实例数*/
        @JsonProperty("InstanceCount")
        private Integer InstanceCount;

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**更新时间*/
        @JsonProperty("UpdateTime")
        private String UpdateTime;

        /**区域*/
        @JsonProperty("Region")
        private String Region;

        /**安全组规则列表*/
        @JsonProperty("Rules")
        private String Rules;

        /**安全组实例列表*/
        @JsonProperty("Instances")
        private String Instances;

    }

}
