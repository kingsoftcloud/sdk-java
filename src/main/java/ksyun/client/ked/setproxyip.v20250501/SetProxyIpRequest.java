package ksyun.client.ked.setproxyip.v20250501;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetProxyIpRequest
* @Description 请求参数
*/
@Data
public class SetProxyIpRequest{
    /**云电脑id*/
    @KsYunField(name="instanceIds",type=2)
    private List<String> InstanceIdsList;

    /**省份*/
    @KsYunField(name="province")
    private String Province;

    /**运营商*/
    @KsYunField(name="isp")
    private String Isp;

    /**城市*/
    @KsYunField(name="city")
    private String City;


}