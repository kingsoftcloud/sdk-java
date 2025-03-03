package ksyun.client.kce.describereponamespace.v20180314;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeRepoNamespaceRequest
 * @Description 请求参数
 */
@Data
public class DescribeRepoNamespaceRequest {
    /**
     * 命名空间名称，若不填写，则默认返回该用户所有命名空间。
     */
    @KsYunField(name = "Namespace")
    private String Namespace;

    /**
     * 单次调用所返回的最大实例数目，默认20，最大99。
     */
    @KsYunField(name = "MaxResults")
    private String MaxResults;

    /**
     * 分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。
     */
    @KsYunField(name = "Marker")
    private String Marker;

    /***/
    @KsYunField(name = "Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**
         * 一个或者多个过滤器<br>有效值：<br>- public 命名空间是否公开的属性
         */
        @KsYunField(name = "Name")
        private String Name;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }

}