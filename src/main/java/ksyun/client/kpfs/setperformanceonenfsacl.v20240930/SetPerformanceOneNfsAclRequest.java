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

    /**共享目录路径。格式：整个文件系统不传或传/；子目录支持dir/xxx、/dir/xxx、dir/xxx/、/dir/xxx/。*/
    @KsYunField(name="ExportPath")
    private String ExportPath;

    /**授权IP列表（计算节点私网IP，单次最多100个）。*/
    @KsYunField(name="Ips",type=2)
    private List<IpsDto> IpsList;

    @Data
    @ToString
    public static class IpsDto {
        /**授权IP地址，仅支持IPv4。支持单个IP（如10.0.0.0）或网段（如10.0.0.1/24）。*/
        @KsYunField(name="Ip")
        private String Ip;

        /**权限级别。ro（只读）、rw（读写）。*/
        @KsYunField(name="Permission")
        private String Permission;

        /**root权限压缩，默认root_squash。root_squash（映射为匿名用户）、no_root_squash（允许root访问）、all_squash（均映射为匿名用户）。*/
        @KsYunField(name="RootSquash")
        private String RootSquash;

        /**计算节点类型。epc（裸金属服务器）、kec（云服务器）。*/
        @KsYunField(name="Type")
        private String Type;

    }

    /**规则描述信息，0-63字符。*/
    @KsYunField(name="Desc")
    private String Desc;

}
