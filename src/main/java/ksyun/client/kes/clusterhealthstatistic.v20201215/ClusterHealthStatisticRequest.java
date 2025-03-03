package ksyun.client.kes.clusterhealthstatistic.v20201215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ClusterHealthStatisticRequest
 * @Description 请求参数
 */
@Data
public class ClusterHealthStatisticRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}