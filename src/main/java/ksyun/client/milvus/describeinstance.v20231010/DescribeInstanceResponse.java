package ksyun.client.milvus.describeinstance.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeInstanceResponse
* @Description DescribeInstance 返回体
*/
@Data
@ToString
public class DescribeInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /**返回数据域*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**实例可用区Code*/
        @JsonProperty("Az")
        private String Az;

        /**实例可用区Name*/
        @JsonProperty("AzName")
        private String AzName;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例状态Code：
CREATING 创建中
RUNNING  运行中
LOCKED	 锁定
ERROR	 异常
DELETING 删除中
UNKNOWN  未知	*/
        @JsonProperty("State")
        private String State;

        /**实例状态Name*/
        @JsonProperty("StateName")
        private String StateName;

        /**实例版本*/
        @JsonProperty("Engine")
        private String Engine;

        /**创建时间*/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /**实例节点地址信息列表*/
        @JsonProperty("Addresses")
        private List<AddressesDto> Addresses;

        @Data
        @ToString
        public static class AddressesDto {
            /**节点IP*/
            @JsonProperty("Host")
            private String Host;

            /**节点Port*/
            @JsonProperty("Port")
            private Integer Port;

            /**节点IP类型；
vip
eip*/
            @JsonProperty("Type")
            private String Type;

        }

        /**资源配置*/
        @JsonProperty("Resources")
        private ResourcesDto Resources;

        @Data
        @ToString
        public static class ResourcesDto {
            /***/
            @JsonProperty("CU")
            private CUDto CU;

            @Data
            @ToString
            public static class CUDto {
                /**个数(单位为cu)*/
                @JsonProperty("CU")
                private Integer CU;

                /**资源类型；
capacity 容量型*/
                @JsonProperty("Type")
                private String Type;

                /**资源类型中文名称*/
                @JsonProperty("TypeName")
                private String TypeName;

            }

        }

        /**子网ID*/
        @JsonProperty("SubnetId")
        private String SubnetId;

        /**虚拟网络ID*/
        @JsonProperty("VnetId")
        private String VnetId;

        /**监控地址*/
        @JsonProperty("MonitorLink")
        private String MonitorLink;

        /**实例用户信息列表*/
        @JsonProperty("Users")
        private List<UsersDto> Users;

        @Data
        @ToString
        public static class UsersDto {
            /**用户ID*/
            @JsonProperty("Id")
            private String Id;

            /**用户名称*/
            @JsonProperty("Name")
            private String Name;

            /**是否为管理员：true、false*/
            @JsonProperty("IsAdmin")
            private Boolean IsAdmin;

            /**创建时间*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

        }

        /**安全组列表，现在暂不支持多安区组*/
        @JsonProperty("SecurityGroupList")
        private List<String> SecurityGroupList;

        /**项目ID*/
        @JsonProperty("ProjectId")
        private String ProjectId;

        /**项目名称*/
        @JsonProperty("ProjectName")
        private String ProjectName;

        /**计费类型*/
        @JsonProperty("BillType")
        private Integer BillType;

        /**商品ID*/
        @JsonProperty("ProductId")
        private String ProductId;

        /**商品类型ID*/
        @JsonProperty("ProductType")
        private Integer ProductType;

        /**商品购买作用
1=创建
3=更配*/
        @JsonProperty("ProductWhat")
        private Integer ProductWhat;

        /**创建时间*/
        @JsonProperty("CreateDateOrder")
        private String CreateDateOrder;

        /**地域*/
        @JsonProperty("Region")
        private String Region;

    }

}
