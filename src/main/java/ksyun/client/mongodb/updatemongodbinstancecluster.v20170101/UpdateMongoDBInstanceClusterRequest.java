package ksyun.client.mongodb.updatemongodbinstancecluster.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdateMongoDBInstanceClusterRequest
 * @Description 请求参数
 */
@Data
public class UpdateMongoDBInstanceClusterRequest {
    /**
     * 实例ID。
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 实例套餐 可选:  1C2G        2C4G        4C8G         8C16G    8C32G    16C64G
     */
    @KsYunField(name = "InstanceClass")
    private String InstanceClass;

    /**
     * 分片集群的更配类型  mongos 或者 shard
     */
    @KsYunField(name = "NodeType")
    private String NodeType;

    /**
     * mongos节点ID 或者 shard节点ID。
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

    /**
     * 磁盘大小,单位GB。mongos节点更配不填，shard节点更配必填。
     */
    @KsYunField(name = "Storage")
    private Integer Storage;


}