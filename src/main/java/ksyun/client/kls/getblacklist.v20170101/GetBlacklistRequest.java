package ksyun.client.kls.getblacklist.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname GetBlacklistRequest
 * @Description 请求参数
 */
@Data
public class GetBlacklistRequest {
    /**
     * 域名空间
     */
    @KsYunField(name = "UniqueName")
    private String UniqueName;

    /**
     * 应用名
     */
    @KsYunField(name = "App")
    private String App;

    /**
     * 推流域名
     */
    @KsYunField(name = "Pubdomain")
    private String Pubdomain;

}