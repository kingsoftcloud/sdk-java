package ksyun.client.kce.describeaddonlist.v20230101;

import com.fasterxml.jackson.annotation.JsonProperty;
import common.BaseResponseModel;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
* @Classname DescribeAddonListResponse
* @Description DescribeAddonList 返回体
*/
@Data
@ToString
public class DescribeAddonListResponse extends BaseResponseModel {

    /**请求ID*/
    @JsonProperty("RequestId")
    private String RequestId;

    /**返回数据*/
    @JsonProperty("Data")
    private DataDto Data;

    @Data
    @ToString
    public static class DataDto {
        /**插件列表*/
        @JsonProperty("AddonList")
        private List<DataAddonListDto> AddonList;

        @Data
        @ToString
        public static class DataAddonListDto {
            /**可使用的k8s版本*/
            @JsonProperty("CompatibleK8SVersion")
            private DataAddonListCompatibleK8SVersionDto CompatibleK8SVersion;

            @Data
            @ToString
            public static class DataAddonListCompatibleK8SVersionDto {
                /**最大版本*/
                @JsonProperty("Max")
                private String Max;

                /**最小版本*/
                @JsonProperty("Min")
                private String Min;

                /**中文描述*/
                @JsonProperty("DescriptionCn")
                private String DescriptionCn;

                /**描述*/
                @JsonProperty("Description")
                private String Description;

                /**插件分类*/
                @JsonProperty("Category")
                private String Category;

                /**插件子分类*/
                @JsonProperty("SubCategory")
                private String SubCategory;

                /**插件ID*/
                @JsonProperty("AddonId")
                private String AddonId;

                /**插件版本*/
                @JsonProperty("AddonVersion")
                private String AddonVersion;

                /**插件名称*/
                @JsonProperty("Name")
                private String Name;

                /**是否默认安装*/
                @JsonProperty("DefaultInstall")
                private Boolean DefaultInstall;

            }

        }

    }

}
