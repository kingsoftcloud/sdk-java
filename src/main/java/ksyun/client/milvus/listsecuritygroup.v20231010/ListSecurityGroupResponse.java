package ksyun.client.milvus.listsecuritygroup.v20231010;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ListSecurityGroupResponse
* @Description ListSecurityGroup 返回体
*/
@Data
@ToString
public class ListSecurityGroupResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /**页码，默认0为第一页*/
    @JsonProperty("Offset")
    private Integer Offset;

    /**每页展示条数。默认10条*/
    @JsonProperty("Limit")
    private Integer Limit;

    /**总条数*/
    @JsonProperty("Total")
    private Integer Total;

    /***/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**安全组ID*/
        @JsonProperty("Id")
        private String Id;

        /**安区组名称*/
        @JsonProperty("Name")
        private String Name;

        /**安全组类型：ipv4*/
        @JsonProperty("IpVersion")
        private String IpVersion;

        /**创建时间*/
        @JsonProperty("CreatedAt")
        private String CreatedAt;

        /**更新时间*/
        @JsonProperty("UpdatedAt")
        private String UpdatedAt;

        /**描述*/
        @JsonProperty("Detail")
        private String Detail;

        /**规则列表*/
        @JsonProperty("Rules")
        private List<DataRulesDto> Rules;

        @Data
        @ToString
        public static class DataRulesDto {
            /**规则ID*/
            @JsonProperty("Id")
            private String Id;

            /**cidr规则*/
            @JsonProperty("Cidr")
            private String Cidr;

            /**描述*/
            @JsonProperty("Detail")
            private String Detail;

            /**创建时间*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**更新时间*/
            @JsonProperty("UpdatedAt")
            private String UpdatedAt;

        }

        /**绑定实例列表*/
        @JsonProperty("Instances")
        private List<DataInstancesDto> Instances;

        @Data
        @ToString
        public static class DataInstancesDto {
            /**实例ID*/
            @JsonProperty("Id")
            private String Id;

            /**实例名称*/
            @JsonProperty("Name")
            private String Name;

            /**创建时间*/
            @JsonProperty("CreatedAt")
            private String CreatedAt;

            /**地址信息，现在暂时无返回*/
            @JsonProperty("Addresses")
            private List<String> Addresses;

        }

    }

}
