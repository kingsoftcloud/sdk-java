package ksyun.client.ked.getdetail.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetDetailResponse
* @Description GetDetail 返回体
*/
@Data
@ToString
public class GetDetailResponse extends BaseResponseModel {

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例id*/
        @JsonProperty("instanceId")
        private String InstanceId;

        /**名称*/
        @JsonProperty("name")
        private String Name;

        /**CPU核数*/
        @JsonProperty("vcpu")
        private Integer Vcpu;

        /**内存大小*/
        @JsonProperty("vmemory")
        private String Vmemory;

        /**系统盘大小*/
        @JsonProperty("sysDisk")
        private String SysDisk;

        /**创建时间*/
        @JsonProperty("createTime")
        private String CreateTime;

        /**节点id*/
        @JsonProperty("edgeNodeId")
        private String EdgeNodeId;

        /**节点名称*/
        @JsonProperty("edgeNodeName")
        private String EdgeNodeName;

        /**机器状态*/
        @JsonProperty("ecStatus")
        private String EcStatus;

        /**安全策略组ID*/
        @JsonProperty("securityGroupId")
        private String SecurityGroupId;

        /**安全策略组名称*/
        @JsonProperty("securityGroupName")
        private String SecurityGroupName;

        /**镜像id*/
        @JsonProperty("imageId")
        private String ImageId;

        /**标签名列表*/
        @JsonProperty("label")
        private List<String> Label;

        /**用户名称,未绑定用户时字段不存在*/
        @JsonProperty("userName")
        private String UserName;

        /**用户id,未绑定用户时字段不存在*/
        @JsonProperty("userId")
        private Integer UserId;

    }

}
