package ksyun.client.kec.describeaccessgroups.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAccessGroupsResponse
* @Description DescribeAccessGroups 返回体
*/
@Data
@ToString
public class DescribeAccessGroupsResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**权限组的总个数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**权限组信息集合*/
    @JsonProperty("AccessGroups")
    private List<AccessGroupsDto> AccessGroups;

    @Data
    @ToString
    public static class AccessGroupsDto {
        /**权限组ID*/
        @JsonProperty("AccessGroupId")
        private String AccessGroupId;

        /**权限组名称*/
        @JsonProperty("AccessGroupName")
        private String AccessGroupName;

        /**标识是否默认权限组*/
        @JsonProperty("DefaultGroup")
        private Boolean DefaultGroup;

        /**权限组描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**权限组的创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**此权限组中包含的权限组规则数量*/
        @JsonProperty("RuleCount")
        private Integer RuleCount;

        /**应用此权限组的文件系统数量*/
        @JsonProperty("FileSystemCount")
        private Integer FileSystemCount;

        /**应用此权限组的文件系统详情信息集合*/
        @JsonProperty("FileSystemInfos")
        private List<AccessGroupsFileSystemInfosDto> FileSystemInfos;

        @Data
        @ToString
        public static class AccessGroupsFileSystemInfosDto {
            /**文件系统名称*/
            @JsonProperty("Name")
            private String Name;

            /**文件系统ID*/
            @JsonProperty("Id")
            private String Id;

        }

    }

}
