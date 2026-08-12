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

    /**授权IP列表，单次最多编辑20个。*/
    @KsYunField(name="Ips",type=2)
    private List<IpsDto> IpsList;

    @Data
    @ToString
    public static class IpsDto {
        /**授权IP，IP不支持修改，需传原IP。支持IP如10.0.0.1；支持网段如10.0.0.1/24。*/
        @KsYunField(name="Ip")
        private String Ip;

        /**权限级别。ro（只读）、rw（读写）。*/
        @KsYunField(name="Permission")
        private String Permission;

        /**root权限压缩，不传默认root_squash。root_squash（映射为匿名用户）、no_root_squash（允许root访问）、all_squash（均映射为匿名用户）。*/
        @KsYunField(name="RootSquash")
        private String RootSquash;

    }

}
