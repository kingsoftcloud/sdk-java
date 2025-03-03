package ksyun.client.postgresql.allocatedbinstanceeip.v20181225;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AllocateDBInstanceEipRequest
 * @Description 请求参数
 */
@Data
public class AllocateDBInstanceEipRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "DBInstanceIdentifier")
    private String DBInstanceIdentifier;

    /**
     * 外网访问端口号,可设置外网访问端口号 范围:10000~65500
     */
    @KsYunField(name = "Port")
    private Integer Port;


}