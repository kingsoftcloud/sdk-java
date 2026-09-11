package ksyun.client.aicp.getskilluploadurl.v20240612;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetSkillUploadUrlResponse
* @Description GetSkillUploadUrl 返回体
*/
@Data
@ToString
public class GetSkillUploadUrlResponse extends BaseResponseModel {

    /**请求唯一id*/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**skill 存储桶*/
        @JsonProperty("Bucket")
        private String Bucket;

        /**skill 存储的ks3 region*/
        @JsonProperty("Region")
        private String Region;

        /**skill 存储的 object key*/
        @JsonProperty("ObjectKey")
        private String ObjectKey;

        /**skill 存储的ks3地址*/
        @JsonProperty("Ks3Url")
        private String Ks3Url;

        /**skill文件上传的url*/
        @JsonProperty("UploadPath")
        private String UploadPath;

    }

}
