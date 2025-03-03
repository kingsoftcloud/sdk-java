package ksyun.client.kec.disableimagecaching.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

import java.util.List;

/**
 * @Classname DisableImageCachingRequest
 * @Description 请求参数
 */
@Data
public class DisableImageCachingRequest {
    /**
     * 预热的镜像ID。
     * ——
     */
    @KsYunField(name = "ImageId")
    private List<String> ImageIdList;


}