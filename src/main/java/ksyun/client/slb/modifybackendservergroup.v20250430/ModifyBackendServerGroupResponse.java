package ksyun.client.slb.modifybackendservergroup.v20250430;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ModifyBackendServerGroupResponse
* @Description ModifyBackendServerGroup 返回体
*/
@Data
@ToString
public class ModifyBackendServerGroupResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**服务器组信息*/
    @JsonProperty("BackendServerGroup")
    private BackendServerGroupDto BackendServerGroup;

    @Data
    @ToString
    public static class BackendServerGroupDto {
        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**服务器组的ID*/
        @JsonProperty("BackendServerGroupId")
        private String BackendServerGroupId;

        /**服务器组的名称*/
        @JsonProperty("Name")
        private String Name;

        /**真实服务器的类型*/
        @JsonProperty("BackendServerType")
        private String BackendServerType;

        /**服务器组类型*/
        @JsonProperty("BackendServerGroupType")
        private String BackendServerGroupType;

        /**Vpc的ID*/
        @JsonProperty("VpcId")
        private String VpcId;

        /**后端协议*/
        @JsonProperty("Protocol")
        private String Protocol;

        /**服务器数量*/
        @JsonProperty("BackendServerNumber")
        private Integer BackendServerNumber;

        /**后端长连接*/
        @JsonProperty("UpstreamKeepalive")
        private String UpstreamKeepalive;

        /**服务器组IP版本*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**调度算法*/
        @JsonProperty("Method")
        private String Method;

        /**慢启动*/
        @JsonProperty("SlowStartEnabled")
        private Boolean SlowStartEnabled;

        /**慢启动时间*/
        @JsonProperty("SlowStartDuration")
        private Integer SlowStartDuration;

    }

}
