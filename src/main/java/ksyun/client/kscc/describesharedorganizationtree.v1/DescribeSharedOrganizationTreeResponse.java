package ksyun.client.kscc.describesharedorganizationtree.v1;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeSharedOrganizationTreeResponse
* @Description DescribeSharedOrganizationTree 返回体
*/
@Data
@ToString
public class DescribeSharedOrganizationTreeResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**组织架构树结果*/
    @JsonProperty("DescribeOrganizationTreeResult")
    private DescribeOrganizationTreeResultDto DescribeOrganizationTreeResult;

    @Data
    @ToString
    public static class DescribeOrganizationTreeResultDto {
        /**根部门数量*/
        @JsonProperty("Total")
        private Integer Total;

        /**部门节点列表*/
        @JsonProperty("Items")
        private List<DescribeOrganizationTreeResultItemsDto> Items;

        @Data
        @ToString
        public static class DescribeOrganizationTreeResultItemsDto {
            /**部门ID*/
            @JsonProperty("Id")
            private String Id;

            /**父部门ID，根部门为空*/
            @JsonProperty("ParentId")
            private String ParentId;

            /**部门名称*/
            @JsonProperty("Name")
            private String Name;

            /**部门完整路径*/
            @JsonProperty("AbsPath")
            private String AbsPath;

            /**AI功能状态，1启用，0禁用*/
            @JsonProperty("AiEnabled")
            private Integer AiEnabled;

            /**子部门列表*/
            @JsonProperty("Children")
            private List<DescribeOrganizationTreeResultItemsChildrenDto> Children;

            @Data
            @ToString
            public static class DescribeOrganizationTreeResultItemsChildrenDto {
                /**子部门ID*/
                @JsonProperty("Id")
                private String Id;

                /**父部门ID*/
                @JsonProperty("ParentId")
                private String ParentId;

                /**子部门名称*/
                @JsonProperty("Name")
                private String Name;

                /**子部门完整路径*/
                @JsonProperty("AbsPath")
                private String AbsPath;

                /**AI功能状态，1启用，0禁用*/
                @JsonProperty("AiEnabled")
                private Integer AiEnabled;

                /**下级部门列表*/
                @JsonProperty("Children")
                private List<DescribeOrganizationTreeResultItemsChildrenChildrenDto> Children;

                @Data
                @ToString
                public static class DescribeOrganizationTreeResultItemsChildrenChildrenDto {
                }

            }

        }

    }

}
