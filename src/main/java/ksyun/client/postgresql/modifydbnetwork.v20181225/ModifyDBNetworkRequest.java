package ksyun.client.postgresql.modifydbnetwork.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname ModifyDBNetworkRequest
 * @Description 请求参数
 */
@Data
public class ModifyDBNetworkRequest {
    /**
     * 实例Id
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * SubnetId
     */
    @KsYunField(name = "SubnetId")
    private String SubnetId;

    /**
     * VpcId
     */
    @KsYunField(name = "VpcId")
    private String VpcId;

}