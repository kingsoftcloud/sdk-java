package ksyun.client.kce.describeassociateclusterlist.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeAssociateClusterListRequest
* @Description 请求参数
*/
@Data
public class DescribeAssociateClusterListRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**分页标识，单次调用未返回全部关联集群时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大关联集群数目，默认20，最大100*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**集群id，支持输入多个集群id进行查询，若不填默认查询所有的关联集群*/
    @KsYunField(name="ClusterId")
    private List<String> ClusterIdList;


}