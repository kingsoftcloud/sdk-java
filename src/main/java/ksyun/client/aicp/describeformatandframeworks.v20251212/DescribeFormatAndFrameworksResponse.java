package ksyun.client.aicp.describeformatandframeworks.v20251212;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeFormatAndFrameworksResponse
 * @Description DescribeFormatAndFrameworks 返回体
 */
@Data
@ToString
public class DescribeFormatAndFrameworksResponse extends BaseResponseModel {

    /**
     * 请求ID
     */
    @JsonProperty("RequestId")
    private String RequestId;

    /**
     * 模型格式与框架列表
     */
    @JsonProperty("FormatAndFrameworks")
    private List<FormatAndFrameworksDto> FormatAndFrameworks;

    @Data
    @ToString
    public static class FormatAndFrameworksDto {
        /**
         * 格式
         */
        @JsonProperty("Format")
        private String Format;

        /**
         * 框架列表
         */
        @JsonProperty("Frameworks")
        private List<String> Frameworks;

    }

}
