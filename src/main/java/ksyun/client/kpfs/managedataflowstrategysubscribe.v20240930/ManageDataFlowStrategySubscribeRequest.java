package ksyun.client.kpfs.managedataflowstrategysubscribe.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ManageDataFlowStrategySubscribeRequest
* @Description 请求参数
*/
@Data
public class ManageDataFlowStrategySubscribeRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略ID。*/
    @KsYunField(name="StrategyId")
    private String StrategyId;

    /**• activate：开启数据流动订阅，仅Subscribe为to_be_subscribed时支持
• cancel：取消数据流动订阅，仅Subscribe为subscribing时支持
*/
    @KsYunField(name="Operation")
    private String Operation;

}
