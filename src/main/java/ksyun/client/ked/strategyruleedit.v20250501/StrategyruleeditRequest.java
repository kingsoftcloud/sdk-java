package ksyun.client.ked.strategyruleedit.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname StrategyruleeditRequest
* @Description 请求参数
*/
@Data
public class StrategyruleeditRequest{
    /**安全组出站规则*/
    @KsYunField(name="policies")

    /**策略组 id
*/
    @KsYunField(name="securityGroupId")
    private String SecurityGroupId;


}