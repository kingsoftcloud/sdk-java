package ksyun.client.kcs.updatepassword.v20160701;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname UpdatePasswordRequest
 * @Description 请求参数
 */
@Data
public class UpdatePasswordRequest {
    /**
     * 可用区     	 默认：对应机房的a区
     */
    @KsYunField(name = "AvailableZone")
    private String AvailableZone;

    /**
     * 缓存服务ID
     */
    @KsYunField(name = "CacheId")
    private String CacheId;

    /**
     * 缓存服务密码。可不填（无密码）或者密码须符合以下规则：含大写字母、小写字母、数字、特殊字符（!@#$%^&*()_+=-）4中字符中的3种以上，且长度为8-30个字符。
     */
    @KsYunField(name = "Password")
    private String Password;

}