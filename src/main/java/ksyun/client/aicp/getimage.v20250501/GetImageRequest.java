package ksyun.client.aicp.getimage.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname GetImageRequest
 * @Description 请求参数
 */
@Data
public class GetImageRequest {
    /**
     * 镜像ID
     */
    @KsYunField(name = "id")
    private Integer Id;

}