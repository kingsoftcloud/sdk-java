package ksyun.client.kec.terminatemodels.v20160304;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname TerminateModelsRequest
* @Description 请求参数
*/
@Data
public class TerminateModelsRequest{
    /**预删除的实例启动模板ID*/
    @KsYunField(name="ModelId")
    private List<String> ModelIdList;


}