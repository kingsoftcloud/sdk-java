package ksyun.client.aicp.describeaccessgroups.v20240612;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAccessGroupsRequest
* @Description 请求参数
*/
@Data
public class DescribeAccessGroupsRequest{
    /**权限组ID，支持传入多个，按权限组ID筛选*/
    @KsYunField(name="AccessGroupId",type=1)
    private List<String> AccessGroupIdList;

    /**过滤器，按权限组名称筛选，Name有效值：access-group-name*/
    @KsYunField(name="Filter",type=1)
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**过滤条件，有效值：
- access-group-name，权限组名称*/
        @KsYunField(name="Name")
        private String Name;

        /**条件值*/
        @KsYunField(name="Value",type=1)
        private List<String> ValueList;

    }

    /**页码，默认1*/
    @KsYunField(name="Page")
    private Integer Page;

    /**每页数量，范围5-1000，默认20*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
