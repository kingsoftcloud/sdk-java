package ksyun.client.kce.describeepcforcluster.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeEpcForClusterRequest
 * @Description 请求参数
 */
@Data
public class DescribeEpcForClusterRequest {
    /**
     * 集群id
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 裸金属服务器实例id
     */
    @KsYunField(name = "InstanceId")
    private List<String> InstanceIdList;

    /***/
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 一个或者多个过滤器，有效值：<br>vpc：vpc-id<br>子网id：subnet-id<br>私网ip：private-ip-address<br>裸金属服务器名称（精确查找）：host-name
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

    /**
     * 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。
     */
    @KsYunField(name = "Marker")
    private Integer Marker;

    /**
     * 单次调用所返回的最大实例数目，默认20， 范围(1-50]。
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    /**
     * 操作类型，可取值：AddNode，传递该值后，返回的数据则自动增加状态过滤，只返回Running、HotStandby状态的EPC实例
     */
    @KsYunField(name = "OperatorType")
    private String OperatorType;

}