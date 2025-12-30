package ksyun.client.kmr.describeservice.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeServiceResponse
* @Description DescribeService 返回体
*/
@Data
@ToString
public class DescribeServiceResponse extends BaseResponseModel {

    /**集群ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**组件详情不展示服务，默认为空*/
    @JsonProperty("Services")
    private String Services;

    /**组件状态*/
    @JsonProperty("ComponentStatus")
    private List<ComponentStatusDto> ComponentStatus;

    @Data
    @ToString
    public static class ComponentStatusDto {
        /**集群ID*/
        @JsonProperty("ClusterId")
        private String ClusterId;

        /**组件ID*/
        @JsonProperty("ComponentId")
        private String ComponentId;

        /**组件名称*/
        @JsonProperty("ComponentName")
        private String ComponentName;

        /**角色
*/
        @JsonProperty("Role")
        private String Role;

        /**节点ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**节点名称
*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**节点IP*/
        @JsonProperty("InternalIp")
        private String InternalIp;

        /**节点组类型*/
        @JsonProperty("InstanceGroupType")
        private String InstanceGroupType;

        /**节点组序号*/
        @JsonProperty("InstanceGroupIndex")
        private Integer InstanceGroupIndex;

        /**可用区序号*/
        @JsonProperty("AvailabilityZoneIndex")
        private Integer AvailabilityZoneIndex;

        /**是否安装*/
        @JsonProperty("Installed")
        private Boolean Installed;

        /**当前状态*/
        @JsonProperty("State")
        private Integer State;

        /**目标状态*/
        @JsonProperty("TargetState")
        private Integer TargetState;

        /**是否为稳定状态*/
        @JsonProperty("Steady")
        private Boolean Steady;

        /**最后启动时间*/
        @JsonProperty("LastStartTime")
        private String LastStartTime;

        /**错误类型*/
        @JsonProperty("ErrorType")
        private Integer ErrorType;

        /**错误信息*/
        @JsonProperty("ErrorMsg")
        private String ErrorMsg;

        /**是否需要重启*/
        @JsonProperty("RestartRequired")
        private Boolean RestartRequired;

        /**额外信息*/
        @JsonProperty("ExtraInfo")
        private List<String> ExtraInfo;

    }

    /**总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
