package client.ebs.resizevolume.v20160304;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ResizeVolumeRequest
* @Description 请求参数
*/
@Data
public class ResizeVolumeRequest{
    /**待扩容的云硬盘ID，云硬盘和云主机必须在同一可用区。长度36个字符，包括字母、数字、-、_*/
    @KsYunField(name="VolumeId")
    private String VolumeId;

    /**云硬盘扩容后的大小，单位GB。区间是：10 ~ 32000，单位GB，且必须比原Size大。步长：10GB*/
    @KsYunField(name="Size")
    private String Size;

    /**云硬盘扩容的方式：
● false（默认）：离线扩容；扩容后，必须经过控制台重启或者调用API重启实例使操作生效
● true：在线扩容，无需重启实例即可完成扩容*/
    @KsYunField(name="OnlineResize")
    private Boolean OnlineResize;

    /**子订单ID*/
    @KsYunField(name="SubOrderId")
    private String SubOrderId;


}