package ksyun.client.epc.createinspecthost.v20151101;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateInspectHostRequest
* @Description 请求参数
*/
@Data
public class CreateInspectHostRequest{
    /**故障检测类型
• 有效值：
    ◦ nccl：需要通过NCCL检查异常情况
    ◦ xid：需要通过XID检查异常情况*/
    @KsYunField(name="InspectType")
    private String InspectType;

    /**故障检测名称*/
    @KsYunField(name="InspectName")
    private String InspectName;

    /**裸金属服务器资源ID，多个ID的实例信息，查看详细ID.N使用方式*/
    @KsYunField(name="HostId",type=2)
    private List<String> HostIdList;

}
