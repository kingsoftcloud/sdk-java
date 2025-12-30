package ksyun.client.tidb.createsecuritygroup.v20210520;

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

        /**安全组类型*/
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

        /**安全组规则*/
        @JsonProperty("Rules")
        private String Rules;

        /**安全组绑定实例*/
        @JsonProperty("Instances")
        private String Instances;

    }

}
