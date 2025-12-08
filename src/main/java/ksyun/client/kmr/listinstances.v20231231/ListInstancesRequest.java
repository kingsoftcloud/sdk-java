package ksyun.client.kmr.listinstances.v20231231;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ListInstancesRequest
* @Description 请求参数
*/
@Data
public class ListInstancesRequest{
    /**当前页码 从0开始*/
    @KsYunField(name="PageNumber")
    private Integer PageNumber;

    /**当前页内数据的个数	*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**- “Running”: 集群当前正在运行并执行其任务。
- “Creating”: 集群正在创建或初始化中。
- “Upgrade”: 集群正在升级到更新的版本或配置。
- “Downgrade”: 集群正在降级到旧的版本或配置。
- “ScaleOut”: 集群正在通过增加更多资源或实例来扩展容量。
- “ScaleIn”: 集群正在通过移除资源或实例来缩减容量。
- “Restart”: 集群正在重启，通常是为了应用更新或从错误中恢复。
- “Reconfig”: 集群正在重新配置新的设置或参数。
- “Freezing”: 集群正在冻结或暂停中。
- “Freeze”: 集群当前已冻结或暂停。
- “CreateFailed”: 集群创建或初始化失败。
- “Terminated”: 集群已终止，不再运行。
- “Deleting”: 集群正在删除或移除中。*/
    @KsYunField(name="InstanceStatus",type=2)
    private List<String> InstanceStatusList;

    /**实例名称或ID，用于标识特定的集群实例。*/
    @KsYunField(name="InstanceNameOrId")
    private String InstanceNameOrId;

}
