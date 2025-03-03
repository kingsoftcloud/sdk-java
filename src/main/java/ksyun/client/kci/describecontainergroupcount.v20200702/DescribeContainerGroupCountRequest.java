package ksyun.client.kci.describecontainergroupcount.v20200702;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeContainerGroupCountRequest
 * @Description 请求参数
 */
@Data
public class DescribeContainerGroupCountRequest {
    /***/
    @KsYunField(name = "Label")

    private LabelDto LabelList;

    @Data
    @ToString
    public static class LabelDto {
        /**
         * 固定为cluster-id
         */
        @KsYunField(name = "Key")
        private String Key;
        /***/
        @KsYunField(name = "Value")
        private List<String> ValueList;
    }
}