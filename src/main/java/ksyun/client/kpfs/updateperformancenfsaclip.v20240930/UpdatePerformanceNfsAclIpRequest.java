package ksyun.client.kpfs.updateperformancenfsaclip.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdatePerformanceNfsAclIpRequest
* @Description 请求参数
*/
@Data
public class UpdatePerformanceNfsAclIpRequest{
    /**访问授权ID。*/
    @KsYunField(name="NfsAclId")
    private String NfsAclId;

    /**授权IP配置列表，单次最多编辑20个。*/
    @KsYunField(name="Ips",type=2)
    private List<IpsDto> IpsList;

    @Data
    @ToString
    public static class IpsDto {
        /**授权IP，IP不支持修改，需传入原IP。支持单个IP（示例：10.0.0.1）和网段（示例：10.0.0.1/24）*/
        @KsYunField(name="Ip")
        private String Ip;

        /**指定的权限级别。枚举值：ro（只读）、rw（读/写）*/
        @KsYunField(name="Permission")
        private String Permission;

        /**root权限压缩。枚举值：root_squash（客户端以root用户访问，映射为匿名用户）、no_root_squash（允许客户端以root用户访问）、all_squash（所有客户端访问，均映射为匿名用户），不传默认为root_squash*/
        @KsYunField(name="RootSquash")
        private String RootSquash;

    }

}
