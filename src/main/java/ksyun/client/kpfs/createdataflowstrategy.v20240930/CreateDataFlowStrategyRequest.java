package ksyun.client.kpfs.createdataflowstrategy.v20240930;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateDataFlowStrategyRequest
* @Description 请求参数
*/
@Data
public class CreateDataFlowStrategyRequest{
    /***/
    @KsYunField(name="FileSystemId")
    private String FileSystemId;

}
