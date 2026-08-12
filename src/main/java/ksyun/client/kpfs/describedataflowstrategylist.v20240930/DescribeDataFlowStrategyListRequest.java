package ksyun.client.kpfs.describedataflowstrategylist.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataFlowStrategyListRequest
* @Description 请求参数
*/
@Data
public class DescribeDataFlowStrategyListRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动策略ID*/
    @KsYunField(name="StrategyId")
    private String StrategyId;

    /**页码。默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

    /**分页大小。默认为10。取值范围1-1000。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

}
