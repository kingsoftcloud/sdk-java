package ksyun.client.kec.modifyinstanceimage.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyInstanceImageRequest
* @Description 请求参数
*/
@Data
public class ModifyInstanceImageRequest{
    /**待更换或者重新安装操作系统的实例ID
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**待更换的镜像ID；如果缺省，表明无需改变镜像，只需重新安装实例的操作系统。
标准UUID格式，形如`^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$`*/
    @KsYunField(name="ImageId")
    private String ImageId;

    /**云主机系统盘配置参数。若不指定该参数，则按照系统默认值进行分配。通用型N2、N3主机支持更换操作系统时指定系统盘大小。*/
    @KsYunField(name="SystemDisk.DiskSize")
    private Integer SystemDiskDiskSize;

    /**实例开机密码
最短8字符，最长32字符，必须包含大小写英文字符和数字，支持其他可见字符*/
    @KsYunField(name="InstancePassword")
    private String InstancePassword;

    /**密钥ID*/
    @KsYunField(name="KeyId",type=1)
    private List<String> KeyIdList;

    /**保留镜像设置登录。该参数只对使用自定义镜像有效。当该值填写为true，默认InstancePassword参数无效。该参数与InstancePassword必须填写一个。
true/false,默认false*/
    @KsYunField(name="KeepImageLogin")
    private Boolean KeepImageLogin;

    /**不能给默认值，不传默认按价格体系配置systemDisk属性中第一个创建*/
    @KsYunField(name="SystemDisk.DiskType")
    private String SystemDiskDiskType;

    /**扩容 offline 离线扩容| online 在线扩容*/
    @KsYunField(name="SystemDisk.ResizeType")
    private String SystemDiskResizeType;

    /**用户自定义数据，必须是base64编码*/
    @KsYunField(name="UserData")
    private String UserData;

}
