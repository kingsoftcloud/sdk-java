package ksyun.client.kpfs.deletedataflow.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DeleteDataFlowRequest
* @Description 请求参数
*/
@Data
public class DeleteDataFlowRequest{
    /**文件系统ID*/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

    /**数据流动ID*/
    @KsYunField(name="DataFlowId")
    private String DataFlowId;

}
