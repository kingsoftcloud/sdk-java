package ksyun.client.kce.describetag.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeTagRequest
* @Description 请求参数
*/
@Data
public class DescribeTagRequest{
    /**镜像仓库名称*/
    @KsYunField(name="RepoName")
    private String RepoName;

    /**单次调用所返回的最大实例数目，默认20，最大99。*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private String Marker;

    /***/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**一个或者多个过滤器，有效值：<br>- tag*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }


}