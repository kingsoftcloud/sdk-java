package ksyun.client.aicp.createmodelversion.v20251212;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateModelVersionRequest
* @Description 请求参数
*/
@Data
public class CreateModelVersionRequest{
    /**模型ID*/
    @KsYunField(name="ModelId")
    private String ModelId;

    /**模型版本名称*/
    @KsYunField(name="ModelVersionName")
    private String ModelVersionName;

    /**模型版本描述*/
    @KsYunField(name="ModelVersionDescription")
    private String ModelVersionDescription;

    /**来源类型，有效值：storage-config*/
    @KsYunField(name="SourceType")
    private String SourceType;

    /**存储配置ID*/
    @KsYunField(name="StorageConfigId")
    private String StorageConfigId;

    /**模型格式*/
    @KsYunField(name="Format")
    private String Format;

    /**模型框架*/
    @KsYunField(name="Framework")
    private String Framework;

}
