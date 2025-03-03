package ksyun.client.mongodb.addsecondaryinstance.v20170101;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname AddSecondaryInstanceRequest
 * @Description 请求参数
 */
@Data
public class AddSecondaryInstanceRequest {
    /**
     * 实例ID
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 新增节点数量。可选：3、5、7
     */
    @KsYunField(name = "NodeNum")
    private String NodeNum;


}