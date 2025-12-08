package ksyun.client.milvus.listinstance.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListInstanceResponse
* @Description ListInstance 返回体
*/
@Data
@ToString
public class ListInstanceResponse extends BaseResponseModel {
    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Code")
    private String Code;

    /***/
    @JsonProperty("Message")
    private String Message;

    /**默认0开始，为第一页*/
    @JsonProperty("Offset")
    private Integer Offset;

    /**每页最大记录数*/
    @JsonProperty("Limit")
    private Integer Limit;

    /**实例总数*/
    @JsonProperty("Total")
    private Integer Total;

    /**实例列表信息*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**实例名称*/
        @JsonProperty("InstanceName")
        private String InstanceName;

        /**可用区名称_en*/
        @JsonProperty("Az")
        private String Az;

        /**可用区名称_zh*/
        @JsonProperty("AzName")
        private String AzName;

        /**实例ID*/
        @JsonProperty("InstanceId")
        private String InstanceId;

        /**实例状态_en*/
        @JsonProperty("State")
        private String State;

        /**实例状态_zh*/
        @JsonProperty("StateName")
        private String StateName;

        /**实例版本*/
        @JsonProperty("Engine")
        private String Engine;

        /**创建时间*/
        @JsonProperty("CreateDate")
        private String CreateDate;

        /**实例节点地址信息*/
        @JsonProperty("Addresses")
        private List<DataDtoAddressesDto> Addresses;

        @Data
        @ToString
        public static class DataDtoAddressesDto {
            /**IP地址*/
            @JsonProperty("Host")
            private String Host;

            /**端口信息*/
            @JsonProperty("Port")
            private Integer Port;

            /**节点ip类型
vip
eip*/
            @JsonProperty("Type")
            private String Type;

        }

        /***/
        @JsonProperty("Resources")
        private DataDtoResourcesDto Resources;

        @Data
        @ToString
        public static class DataDtoResourcesDto {
            /**资源信息*/
            @JsonProperty("CU")
            private DataDtoResourcesDtoCUDto CU;

            @Data
            @ToString
            public static class DataDtoResourcesDtoCUDto {
                /**配置个数(单位：cu)*/
                @JsonProperty("CU")
                private Integer CU;

                /**资源类型code*/
                @JsonProperty("Type")
                private String Type;

                /**资源类型Name*/
                @JsonProperty("TypeName")
                private String TypeName;

            }

        }

        /**用户信息，暂不返回*/
        @JsonProperty("Users")
        private List<String> Users;

        /**安全组列表，现暂不支持多安全组*/
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

        /**商品作用*/
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
