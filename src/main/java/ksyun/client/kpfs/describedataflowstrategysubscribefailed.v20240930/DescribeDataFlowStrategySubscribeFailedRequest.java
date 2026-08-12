package ksyun.client.kpfs.describedataflowstrategysubscribefailed.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataFlowStrategySubscribeFailedRequest
* @Description 请求参数
*/
@Data
public class DescribeDataFlowStrategySubscribeFailedRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略ID。*/
    @KsYunField(name="StrategyId")
    private String StrategyId;

    /**订阅ID。*/
    @KsYunField(name="SubscribeId")
    private String SubscribeId;

    /**获取失败列表起始时间,取值：yyyy-MM-dd HH:mm:ss*/
    @KsYunField(name="StartTime")
    private String StartTime;

    /**获取失败列表结束时间,取值：yyyy-MM-dd HH:mm:ss
查看最新的订阅失败，入参：endTime:--*/
    @KsYunField(name="EndTime")
    private String EndTime;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小。默认为10。取值范围1-1000。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
