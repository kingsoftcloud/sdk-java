package ksyun.client.aicp.batchmodifystructureddata.v20251114;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname BatchModifyStructuredDataRequest
* @Description 请求参数
*/
@Data
public class BatchModifyStructuredDataRequest{
    /**知识库 ID*/
    @KsYunField(name="DatasetId")
    private String DatasetId;

    /**文档 ID*/
    @KsYunField(name="DocumentId")
    private String DocumentId;

    /**仅提交当前页有效修改的行，一次最多 100 条*/
    @KsYunField(name="Items",type=2)
    private List<ItemsDto> ItemsList;

    @Data
    @ToString
    public static class ItemsDto {
        /**需更新的字段键值对（仅变化字段），示例：{ "员工": "张三"，"销售金额":"1000"}*/
        @KsYunField(name="Values")
        private ItemsValuesDto Values;

        @Data
        @ToString
        public static class ItemsValuesDto {
            /**动态参数*/
            @KsYunField(name="Dynamic")
            private String Dynamic;

        }

        /**行 ID*/
        @KsYunField(name="RowId")
        private String RowId;

    }

}
