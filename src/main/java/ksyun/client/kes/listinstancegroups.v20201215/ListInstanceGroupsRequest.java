package ksyun.client.kes.listinstancegroups.v20201215;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListInstanceGroupsRequest
 * @Description 请求参数
 */
@Data
public class ListInstanceGroupsRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

}