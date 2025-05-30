package ksyun.client.kce2.describeaddoninstances.v20230101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname DescribeAddonInstancesRequest
 * @Description 请求参数
 */
@Data
public class DescribeAddonInstancesRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "CulsterId")
    private String CulsterId;

    /**
     * 集群名称
     */
    @KsYunField(name = "ClusterName")
    private String ClusterName;

    /**
     * 插件名称
     */
    @KsYunField(name = "Name")
    private String Name;

    /**
     * 插件ID
     */
    @KsYunField(name = "AddonIds", type = 2)
    private List<String> AddonIdsList;

}