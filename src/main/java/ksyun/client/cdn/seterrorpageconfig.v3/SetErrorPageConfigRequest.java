package ksyun.client.cdn.seterrorpageconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetErrorPageConfigRequest
* @Description 请求参数
*/
@Data
public class SetErrorPageConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**由ErrorPage组成的数组，表示自定义错误页面列表。注意：该数组是有序的，如果一个相同状态码在数组里有配置子集，则以最后面的子集为准。*/
    @KsYunField(name="ErrorPages",type=2)
    private List<ErrorPagesDto> ErrorPagesList;

    @Data
    @ToString
    public static class ErrorPagesDto {
        /**错误的状态码。支持状态码400,403,404,405,406,414,416,500,501,502,503,504，不支持多条输入*/
        @KsYunField(name="ErrorHttpCode")
        private String ErrorHttpCode;

        /**自定义发生错误后跳转的页面URL。注：需要检验URL的合法性，如果URL不是以https://或者http://开头，则报错，提示输入url有误。*/
        @KsYunField(name="CustomPageUrl")
        private String CustomPageUrl;

    }

}
