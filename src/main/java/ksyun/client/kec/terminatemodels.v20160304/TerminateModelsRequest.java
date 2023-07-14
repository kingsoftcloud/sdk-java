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
    /**只传ModelId删除模板以及模板下对应的版本*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**传ModelId和ModelVersion，删除某个模板下的版本*/
    @KsYunField(name="ModelVersion")
    private Integer ModelVersion;


}