package ksyun.client.kpfs.setperformanceonenfsacl.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname SetPerformanceOneNfsAclRequest
* @Description 请求参数
*/
@Data
public class SetPerformanceOneNfsAclRequest{
    /**文件系统的实例ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**共享目录路径。格式：整个文件系统：不传或传/；子目录：支持格式 dir/xxx 或 /dir/xxx 或 dir/xxx/ 或 /dir/xxx/。*/
    @KsYunField(name="ExportPath")
    private String ExportPath;

    /**授权IP列表，为计算节点的私网IP，单次最多添加100个。*/
    @KsYunField(name="Ips",type=2)
    private List<IpsDto> IpsList;

    @Data
    @ToString
    public static class IpsDto {
        /**授权IP地址，仅支持IPv4。单个IP示例：10.0.0.0；网段示例：10.0.0.1/24*/
        @KsYunField(name="Ip")
        private String Ip;

        /**指定的权限级别。枚举值：ro（只读）、rw（读/写）*/
        @KsYunField(name="Permission")
        private String Permission;

        /**root权限压缩，不传默认为root_squash。枚举值：root_squash（客户端以root用户访问，映射为匿名用户）、no_root_squash（允许客户端以root用户访问）、all_squash（所有客户端访问，均映射为匿名用户）*/
        @KsYunField(name="RootSquash")
        private String RootSquash;

        /**计算节点类型。枚举值：epc（裸金属服务器）、kec（云服务器）*/
        @KsYunField(name="Type")
        private String Type;

    }

    /**规则描述信息。0-63字符。*/
    @KsYunField(name="Desc")
    private String Desc;

}
