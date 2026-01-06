package ksyun.client.cdn.setcdnblockdomainurl.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetCdnBlockDomainUrlRequest
* @Description 请求参数
*/
@Data
public class SetCdnBlockDomainUrlRequest{
    /**操作接口名，系统规定参数 取值：block：屏蔽URL；unblock：解除屏蔽*/
    @KsYunField(name="BlockType")
    private String BlockType;

    /**URL列表*/
    @KsYunField(name="Urls",type=2)
    private List<UrlsDto> UrlsList;

    @Data
    @ToString
    public static class UrlsDto {
        /**具体的URL，以http://开头，屏蔽功能同时屏蔽http和https的访问；*/
        @KsYunField(name="Url")
        private String Url;

    }

    /**(仅在解除屏蔽时生效)，解除屏蔽时，是否联动触发刷新任务 取值：on：触发刷新任务、off：不触发刷新任务 ，默认为off*/
    @KsYunField(name="RefreshOnUnblock")
    private String RefreshOnUnblock;

}
