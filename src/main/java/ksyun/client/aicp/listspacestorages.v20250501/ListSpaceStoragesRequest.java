package ksyun.client.aicp.listspacestorages.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListSpaceStoragesRequest
 * @Description 请求参数
 */
@Data
public class ListSpaceStoragesRequest {
    /**
     * 存储ID
     */
    @KsYunField(name = "storage_id")
    private Integer Storage_id;

    /**
     * 存储配置ID。
     * 请访问训练平台，进入 资源管理-存储管理-存储配置 获取对应存储配置的id。
     */
    @KsYunField(name = "storage_config_id")
    private Integer Storage_config_id;

    /**
     * 第几页
     */
    @KsYunField(name = "page_index")
    private Integer Page_index;

    /**每页条数*/
    @KsYunField(name="page_size")
    private Integer Page_size;

}