package ksyun.client.vpc.createhavip.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname CreateHaVipRequest
 * @Description 请求参数
 */
@Data
public class CreateHaVipRequest {
    /**
     * 子网的ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * 高可用虚拟IP的IP地址
     */
    @KsYunField(name="IpAddress")
    private String IpAddress;

}