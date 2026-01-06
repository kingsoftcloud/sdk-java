package ksyun.client.cdn.validateip.v3;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ValidateIPRequest
* @Description 请求参数
*/
@Data
public class ValidateIPRequest{
    /**指定的IP，不支持批量IP*/
    @KsYunField(name="Ip")
    private String Ip;

}
