package ksyun.client.mongodb.describemongodbinstancenode.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DescribeMongoDBInstanceNodeRequest
 * @Description 请求参数
 */
@Data
public class DescribeMongoDBInstanceNodeRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 分片集群的shard节点的ID。暂不支持批量查询。
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

}