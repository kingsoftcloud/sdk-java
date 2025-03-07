package ksyun.client.ked.getstock.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetStockRequest
 * @Description 请求参数
 */
@Data
public class GetStockRequest {
    /**
     * 节点配置id
     */
    @KsYunField(name = "edgeNodeId")
    private String EdgeNodeId;

}