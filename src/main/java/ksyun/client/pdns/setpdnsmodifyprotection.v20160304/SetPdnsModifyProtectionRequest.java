package ksyun.client.pdns.setpdnsmodifyprotection.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetPdnsModifyProtectionRequest
* @Description 请求参数
*/
@Data
public class SetPdnsModifyProtectionRequest{
    /**Zone的ID*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**是否开启修改保护on/off*/
    @KsYunField(name="ModifyProtection")
    private String ModifyProtection;

}
