package ksyun.client.aicp.describeaccessgroups.v20240612;

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

    /**权限组总数*/
    @JsonProperty("TotalCount")
    private Integer TotalCount;

    /**当前页码*/
    @JsonProperty("Page")
    private Integer Page;

    /**每页数量*/
    @JsonProperty("PageSize")
    private Integer PageSize;

    /**权限组列表*/
    @JsonProperty("AccessGroupSet")
    private List<AccessGroupSetDto> AccessGroupSet;

    @Data
    @ToString
    public static class AccessGroupSetDto {
        /**权限组ID*/
        @JsonProperty("AccessGroupId")
        private String AccessGroupId;

        /**权限组名称*/
        @JsonProperty("AccessGroupName")
        private String AccessGroupName;

        /**权限组描述*/
        @JsonProperty("Description")
        private String Description;

        /**成员列表*/
        @JsonProperty("Users")
        private List<AccessGroupSetUsersDto> Users;

        @Data
        @ToString
        public static class AccessGroupSetUsersDto {
            /**子账号ID*/
            @JsonProperty("UserId")
            private String UserId;

            /**成员角色，枚举值：
- writer，管理员
- reader，普通成员*/
            @JsonProperty("Permission")
            private String Permission;

        }

        /**创建时间*/
        @JsonProperty("CreateTime")
        private String CreateTime;

        /**创建者子账号ID*/
        @JsonProperty("CreateUser")
        private String CreateUser;

    }

}
