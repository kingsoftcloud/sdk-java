package ksyun.client.epc.deleteimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteImageRequest
 * @Description 请求参数
 */
@Data
public class DeleteImageRequest {
    /**
     * 原镜像ID
     */
    @KsYunField(name = "ImageId")
    private String ImageId;


}