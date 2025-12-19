package ksyun.client.cdn.setvideoseekconfig.v20250503;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetVideoSeekConfigRequest
* @Description 请求参数
*/
@Data
public class SetVideoSeekConfigRequest{
    /**域名ID*/
    @KsYunField(name="DomainId")
    private String DomainId;

    /**配置是否开启或关闭 取值：on、off，默认值为off关闭。*/
    @KsYunField(name="Enable")
    private String Enable;

}
