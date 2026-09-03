package ksyun.client.aicp.updatedocumentmetadata.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname UpdateDocumentMetadataRequest
* @Description 请求参数
*/
@Data
public class UpdateDocumentMetadataRequest{
    /**知识库ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**操作的文档元数据*/
    @KsYunField(name="OperationData",type=2)
    private List<OperationDataDto> OperationDataList;

    @Data
    @ToString
    public static class OperationDataDto {
        /**文档ID*/
        @KsYunField(name="DocumentId")
        private String DocumentId;

        /**元数据列表*/
        @KsYunField(name="MetadataList",type=2)
        private List<OperationDataMetadataListDto> MetadataListList;

        @Data
        @ToString
        public static class OperationDataMetadataListDto {
            /**元数据ID*/
            @KsYunField(name="Id")
            private String Id;

            /**元数据名称*/
            @KsYunField(name="Name")
            private String Name;

            /**元数据的具体值
Type为string时，示例值："测试"
Type为time时，示例值：1784877515248
Type为number时，示例值：19
Type为array[string]时，示例值：["张三", "李四", "王五"]
Type为array[number]时，示例值：[18, 19, 20, 25, 28]*/
            @KsYunField(name="Value")
            private String Value;

            /**元数据类型
string number time array[number] array[string]*/
            @KsYunField(name="Type")
            private String Type;

        }

    }

}
