package ksyun.client.cdn.submitpreloadcaches.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SubmitPreloadCachesRequest
* @Description 请求参数
*/
@Data
public class SubmitPreloadCachesRequest{
    /**需要预热的Url列表*/
    @KsYunField(name="Urls",type=2)
    private List<UrlsDto> UrlsList;

    @Data
    @ToString
    public static class UrlsDto {
        /**需要提交预热的Url，单条输入*/
        @KsYunField(name="Url")
        private String Url;

    }

}
