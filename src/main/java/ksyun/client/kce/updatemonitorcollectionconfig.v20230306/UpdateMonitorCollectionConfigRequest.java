package ksyun.client.kce.updatemonitorcollectionconfig.v20230306;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateMonitorCollectionConfigRequest
* @Description 请求参数
*/
@Data
public class UpdateMonitorCollectionConfigRequest{
    /**实例id*/
    @KsYunField(name="InstanceId")
    private String InstanceId;

    /**集群id*/
    @KsYunField(name="ClusterId")
    private String ClusterId;

    /**监控采集配置名称*/
    @KsYunField(name="MonitorName")
    private String MonitorName;

    /**监控采集配置类型，有效值： 
RawJob
PodMonitor
ServiceMonitor*/
    @KsYunField(name="Type")
    private String Type;

    /**监控采集配置yaml*/
    @KsYunField(name="ConfigYaml")
    private String ConfigYaml;

}
