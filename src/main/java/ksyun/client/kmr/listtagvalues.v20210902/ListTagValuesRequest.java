package ksyun.client.kmr.listtagvalues.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListTagValuesRequest
 * @Description 请求参数
 */
@Data
public class ListTagValuesRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;


}