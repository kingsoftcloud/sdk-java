package ksyun.client.ked.setproxyip.v1;

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

    /**省份：湖北 湖南 江西 山东 江苏 安徽 浙江 福建 上海 广东 广西 海南 云南 贵州 西藏 重庆 宁夏 新疆 青海 陕西 甘肃 北京 天津 河北 山西 内蒙古 辽宁 吉林 黑龙江 四川 */
    @KsYunField(name="province")
    private String Province;

    /**运营商：电信、联通、移动*/
    @KsYunField(name="isp")
    private String Isp;

    /**城市*/
    @KsYunField(name="city")
    private String City;

}
