package ksyun.client.aicp.createmetadata.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateMetadataResponse
* @Description CreateMetadata 返回体
*/
@Data
@ToString
public class CreateMetadataResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**元数据ID*/
    @JsonProperty("Id")
    private String Id;

    /**元数据类型*/
    @JsonProperty("Type")
    private String Type;

    /**元数据名称*/
    @JsonProperty("Name")
    private String Name;

}
