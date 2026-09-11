package ksyun.client.aicp.getskilldownloadurl.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSkillDownloadUrlResponse
* @Description GetSkillDownloadUrl 返回体
*/
@Data
@ToString
public class GetSkillDownloadUrlResponse extends BaseResponseModel {

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**skill 下载地址*/
        @JsonProperty("DownloadUrl")
        private String DownloadUrl;

    }

    /**请求id*/
    @JsonProperty("RequestId")
    private String RequestId;

}
