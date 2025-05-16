package ksyun.client.krds.allocatedbinstanceeip.v20160701;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname AllocateDBInstanceEipRequest
 * @Description 请求参数
 */
@Data
public class AllocateDBInstanceEipRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * EIP端口号		固定取值：[10000,65500]    未指定则默认随机分配
     */
    @KsYunField(name = "Port")
    private String Port;

}