package ksyun.client.aicp.listspacestoragebindedspaces.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname ListSpaceStorageBindedSpacesRequest
 * @Description 请求参数
 */
@Data
public class ListSpaceStorageBindedSpacesRequest {
    /**
     * 空间存储ID
     */
    @KsYunField(name = "storage_id")
    private Integer Storage_id;

}