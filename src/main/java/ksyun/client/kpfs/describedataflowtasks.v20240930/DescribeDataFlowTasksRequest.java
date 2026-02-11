package ksyun.client.kpfs.describedataflowtasks.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeDataFlowTasksRequest
* @Description 请求参数
*/
@Data
public class DescribeDataFlowTasksRequest{
    /**文件系统ID。*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动ID。*/
    @KsYunField(name="DataFlowId")
    private String DataFlowId;

    /**数据流动任务ID，逗号分割。*/
    @KsYunField(name="TaskIds")
    private String TaskIds;

    /**分页大小，默认为10。*/
    @KsYunField(name="PageSize")
    private Integer PageSize;

    /**页码，默认为1。*/
    @KsYunField(name="PageNum")
    private Integer PageNum;

}
