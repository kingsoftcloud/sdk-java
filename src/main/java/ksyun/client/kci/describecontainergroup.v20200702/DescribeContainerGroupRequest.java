package ksyun.client.kci.describecontainergroup.v20200702;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeContainerGroupRequest
 * @Description 请求参数
 */
@Data
public class DescribeContainerGroupRequest {
    /**
     * 容器实例ID
     */
    @KsYunField(name = "ContainerGroupId")
    private List<String> ContainerGroupIdList;

    /**
     * 每页返回的最大记录数，最大100
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 记录起始位置
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 资源项目ID，不指定默认查询有权限的全部项目下资源
     */
    @KsYunField(name = "ProjectId")
    private List<Integer> ProjectId;

    /**
     * 容器实例名称关键字模糊匹配查询
     */
    @KsYunField(name = "Search")
    private String Search;

    /**
     * 支持的过滤筛选条件如下：
     * - subnet-id
     * - vpc-id
     * - availability-zone.name、
     * - status
     * <p>
     * status常用值范围
     * - 未知Unknown
     * - ImagePulling
     * - Running
     * - Failed
     * - Succeeded
     */
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 过滤参数类型名，如subnet-id
         */
        @KsYunField(name = "Name")
        private String Name;
        /**
         * 过滤参数值
         */
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}