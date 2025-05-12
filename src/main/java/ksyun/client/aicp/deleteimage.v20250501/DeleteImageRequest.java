package ksyun.client.aicp.deleteimage.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

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