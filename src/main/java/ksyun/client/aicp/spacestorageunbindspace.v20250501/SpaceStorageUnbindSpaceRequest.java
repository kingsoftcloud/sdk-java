package ksyun.client.aicp.spacestorageunbindspace.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname SpaceStorageUnbindSpaceRequest
 * @Description 请求参数
 */
@Data
public class SpaceStorageUnbindSpaceRequest {
    /**
     * 存储空间ID
     */
    @KsYunField(name = "storage_id")
    private Integer Storage_id;

    /**
     * 空间ID
     */
    @KsYunField(name = "space_id")
    private Integer Space_id;

}