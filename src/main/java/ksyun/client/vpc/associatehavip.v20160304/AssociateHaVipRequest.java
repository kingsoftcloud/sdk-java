package ksyun.client.vpc.associatehavip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AssociateHaVipRequest
 * @Description 请求参数
 */
@Data
public class AssociateHaVipRequest {
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