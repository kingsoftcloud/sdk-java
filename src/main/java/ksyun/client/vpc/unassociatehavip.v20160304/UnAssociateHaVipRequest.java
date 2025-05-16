package ksyun.client.vpc.unassociatehavip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UnAssociateHaVipRequest
 * @Description 请求参数
 */
@Data
public class UnAssociateHaVipRequest {
    /**
     * 网卡的ID
     */
    @KsYunField(name = "NetworkInterfaceId")
    private String NetworkInterfaceId;

    /**
     * 高可用虚拟IP的ID
     */
    @KsYunField(name = "HaVipId")
    private String HaVipId;

}