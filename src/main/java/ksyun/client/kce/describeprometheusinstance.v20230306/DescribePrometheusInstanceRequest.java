package ksyun.client.kce.describeprometheusinstance.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribePrometheusInstanceRequest
* @Description 请求参数
*/
@Data
public class DescribePrometheusInstanceRequest{
    /**实例id，若不填，则默认查询该地域下的所有实例*/
    @KsYunField(name = "InstanceId", type = 1)
    private List<String> InstanceIdList;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目，默认20，最大100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**模糊匹配，可匹配字段：InstanceName（实例名称）*/
    @KsYunField(name="Search")
    private String Search;

}
