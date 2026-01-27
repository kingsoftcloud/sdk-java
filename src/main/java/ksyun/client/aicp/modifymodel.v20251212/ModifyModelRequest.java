package ksyun.client.aicp.modifymodel.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname ModifyModelRequest
* @Description 请求参数
*/
@Data
public class ModifyModelRequest{
    /**模型ID*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**模型名称*/
    @KsYunField(name="ModelName")
    private String ModelName;

    /**模型描述*/
    @KsYunField(name="ModelDescription")
    private String ModelDescription;

}
