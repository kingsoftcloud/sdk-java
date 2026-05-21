package ksyun.client.aicp.reindexdocuments.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ReindexDocumentsResponse
* @Description ReindexDocuments 返回体
*/
@Data
@ToString
public class ReindexDocumentsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

}
