package ksyun.client.kpfs.describedataflowstrategysubscribe.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataFlowStrategySubscribeRequest
* @Description 请求参数
*/
@Data
public class DescribeDataFlowStrategySubscribeRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略ID。*/
    @KsYunField(name="StrategyId")
    private String StrategyId;

}
