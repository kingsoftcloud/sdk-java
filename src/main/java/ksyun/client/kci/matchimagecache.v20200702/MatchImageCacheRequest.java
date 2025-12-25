package ksyun.client.kci.matchimagecache.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname MatchImageCacheRequest
* @Description 请求参数
*/
@Data
public class MatchImageCacheRequest{
    /**镜像列表，最多支持5个镜像，镜像必须是正确的格式，如

- hub.kce.ksyun.com/ksyun/nginx:1.0
- nginx/nginx:1.0
- nginx:1.0@sha256:1f4f402b9c14f3ae92b11ada1dfe9893a88f0faeb0b2f4b903e2c67a0c3bf0de*/
    @KsYunField(name = "Image", type = 1)
    private List<String> ImageList;

}
