package ksyun.client.kead.describeblockip.v20200101;
import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeBlockIpRequest
* @Description 请求参数
*/
@Data
public class DescribeBlockIpRequest{
    /**单个IP或所属实例名称*/
    @KsYunField(name="SearchStr")
    private String SearchStr;

    /**封禁状态，有效值

- block 封禁中
- unblock 已解封*/
    @KsYunField(name="Status")
    private String Status;

    /**资源类型，有效值

- vpc_vm 云服务器
- lb 负载均衡
- other 其他*/
    @KsYunField(name="InstanceType")
    private String InstanceType;

    /**数据中心代码，可选值

- cn-beijing-6 华北1（北京）
- cn-shanghai-2 华东1（上海）
- cn-guangzhou-1 华南1（广州）
- cn-hongkong-2 香港  
- ap-singapore-1 新加坡*/
    @KsYunField(name="RegionCode")
    private String RegionCode;

    /**查询起始时间，示例：2021-08-01 11:21:51*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**查询结束时间，示例：2021-08-01 11:21:51*/
    @KsYunField(name="endTime")
    private String endTime;


}