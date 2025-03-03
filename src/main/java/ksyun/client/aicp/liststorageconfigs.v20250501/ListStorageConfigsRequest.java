package ksyun.client.aicp.liststorageconfigs.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListStorageConfigsRequest
 * @Description 请求参数
 */
@Data
public class ListStorageConfigsRequest {
    /**
     * 页码
     */
    @KsYunField(name = "page_index")
    private Integer Page_index;

    /**
     * 每页条数
     */
    @KsYunField(name = "page_size")
    private Integer Page_size;

}