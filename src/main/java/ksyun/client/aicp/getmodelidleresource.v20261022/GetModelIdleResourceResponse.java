package ksyun.client.aicp.getmodelidleresource.v20261022;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetModelIdleResourceResponse
* @Description GetModelIdleResource 返回体
*/
@Data
@ToString
public class GetModelIdleResourceResponse extends BaseResponseModel {

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**模型名称*/
    @JsonProperty("ModelName")
    private String ModelName;

    /**是否有闲时资源*/
    @JsonProperty("HasIdle")
    private Boolean HasIdle;

    /**集群预估闲时资源量级，无闲时资源时为0*/
    @JsonProperty("PredictIdleTpm")
    private Long PredictIdleTpm;

    /**提示信息*/
    @JsonProperty("Notes")
    private List<String> Notes;

}
