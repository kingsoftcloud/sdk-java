package ksyun.client.cdn.setreferprotectionconfig.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname SetReferProtectionConfigRequest
 * @Description 请求参数
 */
@Data
public class SetReferProtectionConfigRequest {
    /**
     * 域名ID
     */
    @KsYunField(name = "DomainId")
    private String DomainId;

    /**
     * 配置是否开启或关闭，取值：on、off，默认值为off；
     * 开启时，参数ReferType和ReferList为必填项。
     */
    @KsYunField(name = "Enable")
    private String Enable;

    /**
     * refer类型，取值：block：黑名单；allow：白名单，开启后必填
     */
    @KsYunField(name = "ReferType")
    private String ReferType;

    /**
     * 逗号（半角）分隔的refer列表；
     * Enable为on时为必填项；
     * 支持多条输入，一次最多输入一百条。
     */
    @KsYunField(name = "ReferList")
    private String ReferList;

    /**
     * 是否允许空refer访问，取值：on：允许；off：不允许；默认值：on。
     */
    @KsYunField(name = "AllowEmpty")
    private String AllowEmpty;

}
