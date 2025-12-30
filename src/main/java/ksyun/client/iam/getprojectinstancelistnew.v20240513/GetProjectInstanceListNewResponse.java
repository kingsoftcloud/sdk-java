package ksyun.client.iam.getprojectinstancelistnew.v20240513;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname GetProjectInstanceListNewResponse
* @Description GetProjectInstanceListNew 返回体
*/
@Data
@ToString
public class GetProjectInstanceListNewResponse extends BaseResponseModel {

    /***/
    @JsonProperty("ListInstanceResult")
    private ListInstanceResultDto ListInstanceResult;

    @Data
    @ToString
    public static class ListInstanceResultDto {
        /***/
        @JsonProperty("Items")
        private List<ListInstanceResultItemsDto> Items;

        @Data
        @ToString
        public static class ListInstanceResultItemsDto {
            /**项目ID

示例值：0*/
            @JsonProperty("ProjectId")
            private Integer ProjectId;

            /**资源ID

示例值：024fbeff-bd2c-4ab0-9740-678b24bf3b8b*/
            @JsonProperty("InstanceId")
            private String InstanceId;

            /**所属产品线ID*/
            @JsonProperty("ProductGroup")
            private Integer ProductGroup;

            /**所属产品类型ID*/
            @JsonProperty("ProductType")
            private Integer ProductType;

            /**示例值：cn-beijing-6*/
            @JsonProperty("Region")
            private String Region;

            /**示例值：73398680*/
            @JsonProperty("AccountId")
            private Integer AccountId;

            /***/
            @JsonProperty("Status")
            private Integer Status;

        }

        /**示例值：1*/
        @JsonProperty("CurrentPage")
        private Integer CurrentPage;

        /**示例值：50*/
        @JsonProperty("PageSize")
        private Integer PageSize;

        /**示例值：77*/
        @JsonProperty("Total")
        private Integer Total;

    }

    /**示例值：32533061e18a48169fce3b61da7ab6b6*/
    @JsonProperty("RequestId")
    private String RequestId;

}
