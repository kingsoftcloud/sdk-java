package ksyun.client.kce.describecomponentparams.v20230101;

import common.annotation.KsYunField;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @Classname DescribeComponentParamsRequest
 * @Description 请求参数
 */
@Data
public class DescribeComponentParamsRequest {
    /**
     * 集群ID
     */
    @KsYunField(name = "ClusterId")
    private String ClusterId;

    /**
     * 组件查询条件
     */
    @KsYunField(name = "Components", type = 2)
    private List<ComponentsDto> ComponentsList;
    /**
     * 游标起始位置
     */
    @KsYunField(name = "Marker")
    private Integer Marker;
    /**
     * 分页参数，每页最大数
     */
    @KsYunField(name = "MaxResults")
    private Integer MaxResults;

    @Data
    @ToString
    public static class ComponentsDto {
        /**
         * 组件类型
         */
        private String Type;
        /**
         * 参数版本
         */
        private String ParamVersion;
    }

}