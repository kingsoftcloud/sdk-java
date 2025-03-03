package ksyun.client.kmr.listclusters.v20210902;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListClustersRequest
 * @Description 请求参数
 */
@Data
public class ListClustersRequest {
    /**
     * 分页参数
     */
    @KsYunField(name = "Marker")
    private String Marker;

}