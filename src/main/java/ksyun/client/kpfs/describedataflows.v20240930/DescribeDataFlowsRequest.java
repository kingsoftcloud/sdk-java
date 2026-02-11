package ksyun.client.kpfs.describedataflows.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataFlowsRequest
* @Description 请求参数
*/
@Data
public class DescribeDataFlowsRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动ID。*/
    @KsYunField(name="DataFlowId")
    private String DataFlowId;

    /**分页大小，默认为10。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页码，默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

}
