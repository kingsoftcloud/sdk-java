package ksyun.client.vpc.addsecondarycidrblock.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AddSecondaryCidrBlockRequest
 * @Description 请求参数
 */
@Data
public class AddSecondaryCidrBlockRequest {
    /**
     * Vpc的ID
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

    /**
     * Vpc附加Ipv4网段的网络范围，不能与VPC已有Ipv4网段重叠，例如：10.0.0.0/16
     */
    @KsYunField(name = "CidrBlock")
    private String CidrBlock;

}