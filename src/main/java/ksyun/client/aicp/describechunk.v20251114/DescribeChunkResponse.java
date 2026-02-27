package ksyun.client.aicp.describechunk.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeChunkResponse
* @Description DescribeChunk 返回体
*/
@Data
@ToString
public class DescribeChunkResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文本分片列表*/
    @JsonProperty("Data")
    private List<DataDto> Data;

    @Data
    @ToString
    public static class DataDto {
        /**分片 ID*/
        @JsonProperty("Id")
        private String Id;

        /**分片文本内容*/
        @JsonProperty("Content")
        private String Content;

        /**在文档中的位置*/
        @JsonProperty("Position")
        private Integer Position;

        /**词数*/
        @JsonProperty("WordCount")
        private Integer WordCount;

        /**token 数*/
        @JsonProperty("Tokens")
        private Integer Tokens;

    }

}
