package ksyun.client.ked.clouddesklist.v20250501;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CloudDesklistResponse
* @Description CloudDesklist 返回体
*/
@Data
@ToString
public class CloudDesklistResponse extends BaseResponseModel {
    /***/
    @JsonProperty("message")
    private String Message;

    /***/
    @JsonProperty("code")
    private Integer Code;

    /***/
    @JsonProperty("requestId")
    private String RequestId;

    /***/
    @JsonProperty("data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /***/
        @JsonProperty("pageSize")
        private Integer PageSize;

        /***/
        @JsonProperty("records")
        private List<RecordsDto> Records;

        @Data
        @ToString
        public static class RecordsDto {
            /***/
            @JsonProperty("id")
            private Integer Id;

            /***/
            @JsonProperty("instanceId")
            private String InstanceId;

            /**已分配的用户名*/
            @JsonProperty("userName")
            private String UserName;

            /***/
            @JsonProperty("name")
            private String Name;

            /**节点id*/
            @JsonProperty("region")
            private String Region;

            /**机器状态 状态，1:ACTIVE (运行中)，2:BUILD(创建中)，3:REBUILD(重装中)，4:SUSPENDED(休眠中)，5:PAUSED(已暂停)，6:RESIZE(规格变更中)，7:VERIFY_RESIZE(检查是否可规格变更中)，8:REVERT_RESIZE(规格变更回退中)，9:PASSWORD(更新密码中)，10:REBOOT(重启中)，11:HARD_REBOOT(硬重启中)，12:DELETED(已删除)，14:ERROR(云主机发生错误)，15:STOPPED(已停止)，16:SHUTOFF(已关闭)，*/
            @JsonProperty("ecStatus")
            private String EcStatus;

            /**cpu核数*/
            @JsonProperty("vcpu")
            private Integer Vcpu;

            /**内存大小*/
            @JsonProperty("vmemory")
            private String Vmemory;

            /**硬盘大小*/
            @JsonProperty("vdiskList")
            private List<String> VdiskList;

            /**系统盘大小*/
            @JsonProperty("sysDisk")
            private String SysDisk;

            /***/
            @JsonProperty("serverVmType")
            private String ServerVmType;

            /***/
            @JsonProperty("ipInfo")
            private IpInfoDto IpInfo;

            @Data
            @ToString
            public static class IpInfoDto {
                /***/
                @JsonProperty("privateIpV6")
                private String PrivateIpV6;

                /***/
                @JsonProperty("privateIpV4")
                private String PrivateIpV4;

                /***/
                @JsonProperty("publicIpV6")
                private String PublicIpV6;

                /***/
                @JsonProperty("publicIpV4")
                private String PublicIpV4;

            }

            /***/
            @JsonProperty("createdTime")
            private String CreatedTime;

            /**策略安全组id*/
            @JsonProperty("securityGroupId")
            private String SecurityGroupId;

            /**已分配的用户id*/
            @JsonProperty("userId")
            private Integer UserId;

            /**计费模式
1: 包年包月
87: 按量付费
5：按量付费（按日月结）*/
            @JsonProperty("billingType")
            private Integer BillingType;

            /***/
            @JsonProperty("systemType")
            private String SystemType;

            /***/
            @JsonProperty("accountId")
            private Integer AccountId;

            /***/
            @JsonProperty("createTime")
            private String CreateTime;

            /**节点id*/
            @JsonProperty("edgeNodeId")
            private String EdgeNodeId;

            /**节点名*/
            @JsonProperty("edgeNodeName")
            private String EdgeNodeName;

            /**是否有用户连接*/
            @JsonProperty("connected")
            private String Connected;

            /**用户邮箱*/
            @JsonProperty("email")
            private String Email;

            /***/
            @JsonProperty("gpu")
            private String Gpu;

            /**绑定的标签*/
            @JsonProperty("label")
            private List<String> Label;

        }

        /***/
        @JsonProperty("pageNum")
        private Integer PageNum;

        /***/
        @JsonProperty("totalCount")
        private Integer TotalCount;

    }

    /**null*/
    @JsonProperty("detail")
    private String Detail;

}
