package ksyun.client.kfw.createcfwaddrbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateCfwAddrbookResponse
* @Description CreateCfwAddrbook 返回体
*/
@Data
@ToString
public class CreateCfwAddrbookResponse extends BaseResponseModel {

    /***/
    @JsonProperty("RequestId")
    private String RequestId;

    /***/
    @JsonProperty("CfwAddrbook")
    private CfwAddrbookDto CfwAddrbook;

    @Data
    @ToString
    public static class CfwAddrbookDto {
        /***/
        @JsonProperty("AddrbookId")
        private String AddrbookId;

        /***/
        @JsonProperty("AddrbookName")
        private String AddrbookName;

        /***/
        @JsonProperty("IpAddress")
        private List<String> IpAddress;

        /***/
        @JsonProperty("Description")
        private String Description;

        /***/
        @JsonProperty("CitationCount")
        private Integer CitationCount;

        /***/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
