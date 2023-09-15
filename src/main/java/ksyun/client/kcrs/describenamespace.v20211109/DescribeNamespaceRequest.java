package ksyun.client.kcrs.describenamespace.v20211109;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNamespaceRequest
* @Description 请求参数
*/
@Data
public class DescribeNamespaceRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**命名空间名称，若不填写，则默认返回该用户所有命名空间*/
    @KsYunField(name="Namespace")
    private String Namespace;

    /**命名空间属性，有效值：<br/>True：公有<br/>False：私有<br/>注：若不填写，筛选所有命名空间*/
    @KsYunField(name="Public")
    private String Public;

    /**单次调用所返回的最大实例数目，默认20，最大99*/
    @KsYunField(name="MaxResults")
    private String MaxResults;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private String Marker;


}