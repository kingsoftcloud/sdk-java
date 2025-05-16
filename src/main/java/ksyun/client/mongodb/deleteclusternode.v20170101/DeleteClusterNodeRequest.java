package ksyun.client.mongodb.deleteclusternode.v20170101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DeleteClusterNodeRequest
 * @Description 请求参数
 */
@Data
public class DeleteClusterNodeRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * mongos节点id。可在控制台查看节点id
     */
    @KsYunField(name = "NodeId")
    private String NodeId;

}