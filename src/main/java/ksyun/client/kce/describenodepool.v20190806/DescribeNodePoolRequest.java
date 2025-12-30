package ksyun.client.kce.describenodepool.v20190806;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNodePoolRequest
* @Description 请求参数
*/
@Data
public class DescribeNodePoolRequest{
    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点池id*/
    @KsYunField(name="NodePoolId",type=1)
    private List<String> NodePoolIdList;

    /**分页标识，单次调用未返回全部实例时，标记下次调用的返回值的起点，默认值是0*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**单次调用所返回的最大实例数目，默认10， 范围(0-50]*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**节点池名称*/
    @KsYunField(name="NodePoolName")
    private String NodePoolName;

}
