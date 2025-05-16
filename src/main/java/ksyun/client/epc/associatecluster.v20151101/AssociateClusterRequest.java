package ksyun.client.epc.associatecluster.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AssociateClusterRequest
 * @Description 请求参数
 */
@Data
public class AssociateClusterRequest {
    /**
     * 裸金属服务器资源ID
     */
    @KsYunField(name = "HostId")
    private String HostId;

    /**
     * 容器ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}