package ksyun.client.pdns.disassociatevpcs.v20160304;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DisassociateVpcsRequest
 * @Description 请求参数
 */
@Data
public class DisassociateVpcsRequest {
    /**
     * Action
     */
    @KsYunField(name = "Action")
    private String Action;

    /**
     * Version
     */
    @KsYunField(name = "Version")
    private String Version;

    /**
     * VpcId
     * 该 VPC 将解关联 PrivateDns 实例
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

}