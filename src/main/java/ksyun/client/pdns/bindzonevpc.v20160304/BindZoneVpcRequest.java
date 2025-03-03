package ksyun.client.pdns.bindzonevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname BindZoneVpcRequest
 * @Description 请求参数
 */
@Data
public class BindZoneVpcRequest {
    /**
     * Zone的ID
     */
    @KsYunField(name = "ZoneId")
    private String ZoneId;

    /**
     * 筛选Filter
     */
    @KsYunField(name = "Vpcs")
    private List<VpcsDto> VpcsList;

    @Data
    @ToString
    public static class VpcsDto {
        /**
         * Region Code,例如cn-beijing-6
         */
        @KsYunField(name = "RegionName")
        private String RegionName;
        /**
         * 要操作的VPC的id
         */
        @KsYunField(name = "VpcId")
        private List<String> VpcIdList;
    }


}