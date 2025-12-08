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
    /***/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
