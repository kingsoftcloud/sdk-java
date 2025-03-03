package ksyun.client.mongodb.addclusternode.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddClusterNodeRequest
 * @Description 请求参数
 */
@Data
public class AddClusterNodeRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 节点类型。可选 mongos    shard
     */
    @KsYunField(name = "NodeType")
    private String NodeType;

    /**
     * mongos或shard的节点规格，必传。只能填规定的规格，如2C4G。
     */
    @KsYunField(name = "NodeClass")
    private String NodeClass;

    /**
     * shard节点的磁盘大小。nodeType选择shard时必填。
     */
    @KsYunField(name = "NodeStorage")
    private Integer NodeStorage;

}