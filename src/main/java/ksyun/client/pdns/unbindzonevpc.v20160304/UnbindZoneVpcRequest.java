package ksyun.client.pdns.unbindzonevpc.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UnbindZoneVpcRequest
* @Description 请求参数
*/
@Data
public class UnbindZoneVpcRequest{
    /**Zone的ID*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**筛选Filter*/
    @KsYunField(name = "Vpcs", type = 1)
    private List<VpcsDto> VpcsList;

    @Data
    @ToString
    public static class VpcsDto {
        /**Region Code,例如cn-beijing-6*/
        @KsYunField(name="RegionName")
        private String RegionName;

        /**要操作的VPC的id*/
        @KsYunField(name = "VpcId", type = 1)
        private List<String> VpcIdList;

    }

}
