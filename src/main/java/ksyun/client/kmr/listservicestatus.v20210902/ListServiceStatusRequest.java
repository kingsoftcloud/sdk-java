package ksyun.client.kmr.listservicestatus.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListServiceStatusRequest
 * @Description 请求参数
 */
@Data
public class ListServiceStatusRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;


}