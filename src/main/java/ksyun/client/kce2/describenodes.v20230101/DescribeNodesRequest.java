package ksyun.client.kce2.describenodes.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeNodesRequest
* @Description 请求参数
*/
@Data
public class DescribeNodesRequest{
    /**集群ID*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**节点id，与InstanceIds 二选一填即可，如果两者均为空，则查询集群下所有的节点
*/
    @KsYunField(name="KceNodeIds",type=2)
    private List<String> KceNodeIdsList;

    /**游标起始位置
默认值：0
*/
    @KsYunField(name="Marker")
    private Integer Marker;

    /**分页参数，每页最大数
值范围0-50
默认值：10*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**实例id ，与KceNodeIds 二选一填即可，如果两者均为空，则查询集群下所有的节点*/
    @KsYunField(name="InstanceIds",type=2)
    private List<String> InstanceIdsList;

}
