package ksyun.client.vpc.allocatesubnetipv6cidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AllocateSubnetIpv6CidrBlockRequest
 * @Description 请求参数
 */
@Data
public class AllocateSubnetIpv6CidrBlockRequest {
    /**
     * 子网ID
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

}