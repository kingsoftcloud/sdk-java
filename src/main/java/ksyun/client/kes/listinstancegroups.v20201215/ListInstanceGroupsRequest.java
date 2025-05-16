package ksyun.client.kes.listinstancegroups.v20201215;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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