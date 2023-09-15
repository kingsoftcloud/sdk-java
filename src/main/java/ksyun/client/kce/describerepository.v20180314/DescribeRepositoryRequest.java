package ksyun.client.kce.describerepository.v20180314;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeRepositoryRequest
* @Description 请求参数
*/
@Data
public class DescribeRepositoryRequest{
    /**镜像仓库名称,若不输入，则默认查询该用户的所有镜像仓库。*/
    @KsYunField(name="RepoName")
    private List<String> RepoNameList;

    /**单次调用所返回的最大实例数目，默认20，最大99。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0。*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /***/
    @KsYunField(name="Filter")
    private List<FilterDto> FilterList;

    @Data
    @ToString
    public static class FilterDto {
        /**一个或者多个过滤器，有效值：<br>- public<br>- namespace*/
        @KsYunField(name="Name")
        private String Name;
        /***/
        @KsYunField(name="Value")
        private List<String> ValueList;
    }


}