package ksyun.client.aicp.deleteimage.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteImageRequest
 * @Description 请求参数
 */
@Data
public class DeleteImageRequest {
    /**
     * 镜像ID
     */
    @KsYunField(name = "id")
    private Integer Id;

}