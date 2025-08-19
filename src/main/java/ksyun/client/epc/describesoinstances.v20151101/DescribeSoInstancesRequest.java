package ksyun.client.epc.describesoinstances.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeSoInstancesRequest
* @Description 请求参数
*/
@Data
public class DescribeSoInstancesRequest{
    /**实例的计费方式，取值：
• PostPaid：按量计费
• PrePaid：包年包月
示例值：PostPaid*/
    @KsYunField(name="InstanceChargeType")
    private String InstanceChargeType;

    /**根据规格过滤实例，最多支持100个实例规格。
• 参数 - N：表示实例的序号。
undefined多个实例规格之间用&分隔*/
    @KsYunField(name="InstanceTypeId")
    private List<String> InstanceTypeIdList;

    /**密钥对的名称。*/
    @KsYunField(name="KeyPairName")
    private String KeyPairName;

    /**分页查询时设置的每页行数。*/
    @KsYunField(name="MaxResults")
    private Integer MaxResults;

    /**分页查询凭证。*/
    @KsYunField(name="NextToken")
    private String NextToken;

    /**实例的私网IP地址，例如主网卡或辅助网卡IP地址。*/
    @KsYunField(name="PrimaryIpAddress")
    private String PrimaryIpAddress;

    /**实例的状态，取值：
• CREATING：创建中
• RUNNING：运行中
• STOPPING：停止中
• STOPPED：已停止
• REBOOTING: 重启中
• STARTING：启动中
• REBUILDING：重装中
• RESIZING：更配中
• ERROR：错误
• DELETING：删除中*/
    @KsYunField(name="Status")
    private String Status;

    /**私有网络ID。*/
    @KsYunField(name="VpcId")
    private String VpcId;

    /**实例所属可用区ID。*/
    @KsYunField(name="ZoneId")
    private String ZoneId;

    /**实例ID，最多支持100个。
• 参数 - N：表示实例的序号。
• 多个Instance ID之间用&分隔。*/
    @KsYunField(name="InstanceIds")
    private List<String> InstanceIdsList;

}