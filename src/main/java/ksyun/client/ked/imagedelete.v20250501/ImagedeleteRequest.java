package ksyun.client.ked.imagedelete.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ImagedeleteRequest
 * @Description 请求参数
 */
@Data
public class ImagedeleteRequest {
    /**
     * 镜像 id
     */
    @KsYunField(name = "imageId")
    private String ImageId;

}