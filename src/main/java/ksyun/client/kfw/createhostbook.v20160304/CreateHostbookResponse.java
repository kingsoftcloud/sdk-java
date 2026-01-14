package ksyun.client.kfw.createhostbook.v20160304;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname CreateHostbookResponse
* @Description CreateHostbook 返回体
*/
@Data
@ToString
public class CreateHostbookResponse extends BaseResponseModel {

    /**请求ID，用于追踪API调用*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**创建的域名簿对象，包含域名簿的详细信息*/
    @JsonProperty("CfwAddrbook")
    private CfwAddrbookDto CfwAddrbook;

    @Data
    @ToString
    public static class CfwAddrbookDto {
        /**域名簿的唯一标识符*/
        @JsonProperty("HostbookId")
        private String HostbookId;

        /**域名簿名称*/
        @JsonProperty("HostbookName")
        private String HostbookName;

        /**域名簿包含的域名列表，支持精确域名和通配符域名*/
        @JsonProperty("HostValue")
        private List<String> HostValue;

        /**域名簿的描述信息*/
        @JsonProperty("Description")
        private String Description;

        /**域名簿被引用的次数，表示有多少规则使用了该域名簿*/
        @JsonProperty("CitationCount")
        private Integer CitationCount;

        /**域名簿的创建时间，格式为 yyyy-MM-dd HH:mm:ss*/
        @JsonProperty("CreateTime")
        private String CreateTime;

    }

}
