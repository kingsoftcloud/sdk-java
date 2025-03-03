package ksyun.client.ked.imageedit.v20250501;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ImageeditRequest
 * @Description 请求参数
 */
@Data
public class ImageeditRequest {
    /**
     * 镜像主键 id
     */
    @KsYunField(name = "id")
    private Integer Id;

    /**
     * 镜像 id
     */
    @KsYunField(name = "imageId")
    private String ImageId;

    /**
     * 镜像名称
     */
    @KsYunField(name = "imageName")
    private String ImageName;


}