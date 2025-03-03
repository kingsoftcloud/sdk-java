package ksyun.client.tidb.deleteinstance.v20210520;

import common.annotation.KsYunField;
import lombok.Data;

/**
 * @Classname DeleteInstanceRequest
 * @Description 请求参数
 */
@Data
public class DeleteInstanceRequest {
    /**
     * 实例ID列表。多个实例ID请用英文逗号隔开。
     */
    @KsYunField(name = "InstanceIds")
    private String InstanceIds;

}