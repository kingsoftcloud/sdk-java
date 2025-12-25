package ksyun.client.kec.createmounttarget.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMountTargetRequest
* @Description 请求参数
*/
@Data
public class CreateMountTargetRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**终端子网ID。有效值：标准UUID格式，形如^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$*/
    @KsYunField(name="SubnetId")
    private String SubnetId;

    /**取值为【ipv4，ipv6】，默认为 ipv4，如果选择了不支持ipv6的VPC且ip version选择 ipv6则报错*/
    @KsYunField(name="IpVersion")
    private String IpVersion;

    /**
     * 权限组ID
     */
    @KsYunField(name = "AccessGroupId")
    private String AccessGroupId;

}
