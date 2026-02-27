package ksyun.client.aicp.importdocuments.v20251114;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname ImportDocumentsResponse
* @Description ImportDocuments 返回体
*/
@Data
@ToString
public class ImportDocumentsResponse extends BaseResponseModel {

    /**请求唯一标识*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**文档信息List*/
    @JsonProperty("Documents")
    private List<DocumentsDto> Documents;

    @Data
    @ToString
    public static class DocumentsDto {
        /**文档信息*/
        @JsonProperty("Document")
        private DocumentsDocumentDto Document;

        @Data
        @ToString
        public static class DocumentsDocumentDto {
            /**文档 ID*/
            @JsonProperty("Id")
            private String Id;

            /**文档名称*/
            @JsonProperty("Name")
            private String Name;

            /**错误描述（如有）*/
            @JsonProperty("Error")
            private String Error;

            /**展示状态：queuing / indexing / available / error*/
            @JsonProperty("DisplayStatus")
            private String DisplayStatus;

        }

        /**批次号，用于轮询索引进度*/
        @JsonProperty("Batch")
        private String Batch;

    }

}
