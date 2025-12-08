package ksyun.client.kcrs.describeinstance.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeInstanceRequest
* @Description 请求参数
*/
@Data
public class DescribeInstanceRequest{
    /**实例id，若不填，则默认查询该地域下的所有实例*/
    @KsYunField(name="InstanceId",type=2)
    private List<String> InstanceIdList;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private String Marker;

    /**单次调用所返回的最大实例数目，默认20，最大99*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**实例所属项目ID，若不填，则默认查询默认项目*/
    @KsYunField(name="ProjectId",type=2)
    private List<String> ProjectIdList;

    /**实例名称，只支持精准匹配*/
    @KsYunField(name="InstanceName")
    private String InstanceName;

}
