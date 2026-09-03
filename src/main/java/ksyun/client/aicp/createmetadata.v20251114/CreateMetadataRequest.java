package ksyun.client.aicp.createmetadata.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname CreateMetadataRequest
* @Description 请求参数
*/
@Data
public class CreateMetadataRequest{
    /**知识库ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**元数据名称*/
    @KsYunField(name="Name")
    private String Name;

    /**元数据类型
string  number  time  array[number]  array[string]*/
    @KsYunField(name="Type")
    private String Type;

}
