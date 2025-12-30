package ksyun.client.aicp.getbatchinferencejobsfinalresultdownloadurl.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetBatchInferenceJobsFinalResultDownloadUrlResponse
* @Description GetBatchInferenceJobsFinalResultDownloadUrl 返回体
*/
@Data
@ToString
public class GetBatchInferenceJobsFinalResultDownloadUrlResponse extends BaseResponseModel {

    /***/
    @JsonProperty("DownloadUrl")
    private String DownloadUrl;

}
