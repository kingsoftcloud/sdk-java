package ksyun.client.kci.describecontainergroupcount.v20200702;

import common.annotation.KsYunField;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;
import java.util.Arrays;

/**
* @Classname DescribeContainerGroupCountRequest
* @Description 请求参数
*/
@Data
public class DescribeContainerGroupCountRequest{
    /***/
    @KsYunField(name="Label")
    private LabelDto1 Label;

    @Data
    @ToString
    public static class LabelDto1 {
        /**固定为cluster-id*/
        @KsYunField(name="Key")
        private String Key;

        /***/
        @KsYunField(name="Value",type=2)
        private List<String> ValueList;

    }

}
