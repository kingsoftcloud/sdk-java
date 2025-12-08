package ksyun.client.kmr.describeclusterinfo.v20210902;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeClusterInfoResponse
* @Description DescribeClusterInfo 返回体
*/
@Data
@ToString
public class DescribeClusterInfoResponse extends BaseResponseModel {
    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**存算分离信息*/
    @JsonProperty("GaeaInfo")
    private GaeaInfoDto GaeaInfo;

    @Data
    @ToString
    public static class GaeaInfoDto {
        /**存算分离路径*/
        @JsonProperty("Ks3Path")
        private String Ks3Path;

        /**存算分离模式：

- Ks3Hdfs: 缓存模式
- Direct：直连模式
- Local： 本地模式*/
        @JsonProperty("Ks3Type")
        private String Ks3Type;

    }

    /**状态码*/
    @JsonProperty("StatusCode")
    private Integer StatusCode;

}
