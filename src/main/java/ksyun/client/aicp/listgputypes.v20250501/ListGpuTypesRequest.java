package ksyun.client.aicp.listgputypes.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ListGpuTypesRequest
 * @Description 请求参数
 */
@Data
public class ListGpuTypesRequest {
    /**
     * 页码
     */
    @KsYunField(name = "page_index")
    private Integer Page_index;

    /**
     * 每页数据大小
     */
    @KsYunField(name = "page_size")
    private Integer Page_size;

}