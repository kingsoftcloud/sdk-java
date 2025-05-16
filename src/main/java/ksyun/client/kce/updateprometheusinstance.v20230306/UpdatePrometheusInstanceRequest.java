package ksyun.client.kce.updateprometheusinstance.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
 * @Classname UpdatePrometheusInstanceRequest
 * @Description 请求参数
 */
@Data
public class UpdatePrometheusInstanceRequest {
    /**
     * 实例id
     */
    @KsYunField(name = "InstanceId")
    private String InstanceId;

    /**
     * 修改实例名称
     */
    @KsYunField(name = "InstanceName")
    private String InstanceName;

    /**
     * 修改数据存储时长 有效值：15、30、45、90、180、365
     */
    @KsYunField(name = "DataRetentionTime")
    private Integer DataRetentionTime;

}