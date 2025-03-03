package ksyun.client.epc.rejectshareimage.v20151101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname RejectShareImageRequest
 * @Description 请求参数
 */
@Data
public class RejectShareImageRequest {
    /***/
    @KsYunField(name = "ImageId")
    private String ImageId;

}